package core.datatypes.either

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.left
import arrow.core.right

suspend fun httpEndpoint(request: String = "Hello?") =
    Either.resolve(
        f = {
            if (request == "Hello?") "HELLO WORLD!".right()
            else Error2.SpecificError.left()
        },
        success = { str ->
            handleSuccess({ a: Any -> log(Level.INFO, "This is a: $a") }, str)
        },
        error = { err ->
            handleError({ e: Any -> log(Level.WARN, "This is e: $e") }, err)
        },
        throwable = { thr ->
            handleThrowable({ throwable: Throwable ->
                log(Level.ERROR, "Log the throwable: $throwable.")
            }, thr)
        },
        unrecoverableState = { Unit.right() }
    )

suspend fun main() {
    println("httpEndpoint().status = ${httpEndpoint().status}")
}

suspend fun <A> handleSuccess(
    log: suspend (a: A) -> Either<Throwable, Unit>,
    a: A
): Either<Throwable, Response> =
    Either.catch {
        Response.Builder(HttpStatus.OK)
            .header(CONTENT_TYPE, CONTENT_TYPE_APPLICATION_JSON)
            .body(a)
            .build()
    }

suspend fun <E> handleError(
    log: suspend (e: E) -> Either<Throwable, Unit>,
    e: E
): Either<Throwable, Response> =
    createErrorResponse(HttpStatus.NOT_FOUND, ErrorResponse("$ERROR_MESSAGE_PREFIX $e"))

suspend fun handleThrowable(
    log: suspend (throwable: Throwable) -> Either<Throwable, Unit>,
    throwable: Throwable
): Either<Throwable, Response> =
    log(throwable)
        .flatMap {
            createErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR,
                ErrorResponse("$THROWABLE_MESSAGE_PREFIX $throwable")
            )
        }

suspend fun createErrorResponse(
    httpStatus: HttpStatus,
    errorResponse: ErrorResponse
): Either<Throwable, Response> =
    Either.catch {
        Response.Builder(httpStatus)
            .header(CONTENT_TYPE, CONTENT_TYPE_APPLICATION_JSON)
            .body(errorResponse)
            .build()
    }

suspend fun log(level: Level, message: String): Either<Throwable, Unit> =
    Unit.right() // Should implement logging.

enum class HttpStatus(val value: Int) {
    OK(200), NOT_FOUND(404), INTERNAL_SERVER_ERROR(500)
}

class Response private constructor(
    val status: HttpStatus,
    val headers: Map<String, String>,
    val body: Any?
) {

    data class Builder(
        val status: HttpStatus,
        var headers: Map<String, String> = emptyMap(),
        var body: Any? = null
    ) {
        fun header(key: String, value: String) =
            apply { this.headers = this.headers + mapOf(key to value) }

        fun body(body: Any?) = apply { this.body = body }
        fun build() = Response(status, headers, body)
    }
}

const val CONTENT_TYPE = "Content-Type"
const val CONTENT_TYPE_APPLICATION_JSON = "application/json"
const val ERROR_MESSAGE_PREFIX = "An error has occurred. The error is:"
const val THROWABLE_MESSAGE_PREFIX = "An exception was thrown. The exception is:"

data class ErrorResponse(val errorMessage: String)
enum class Level { INFO, WARN, ERROR }
