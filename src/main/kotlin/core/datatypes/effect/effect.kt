package core.datatypes.effect

import arrow.core.continuations.Effect
import arrow.core.continuations.effect
import arrow.core.continuations.ensureNotNull
import java.io.File
import java.io.FileNotFoundException

@JvmInline
value class Content(val body: List<String>)

sealed interface FileError

@JvmInline
value class SecurityError(val msg: String?) : FileError

@JvmInline
value class FileNotFound(val path: String) : FileError
object EmptyPath : FileError {
    override fun toString() = "EmptyPath"
}

fun readFile(path: String): Effect<EmptyPath, Unit> = effect {
    if (path.isEmpty()) shift(EmptyPath) else Unit
}

fun readFile2(path: String?): Effect<EmptyPath, Unit> = effect {
    ensureNotNull(path) { EmptyPath }
    ensure(path.isEmpty()) { EmptyPath }
}

fun readFile3(path: String?): Effect<FileError, Content> = effect {
    ensureNotNull(path) { EmptyPath }
    ensure(path.isNotEmpty()) { EmptyPath }
    try {
        val lines = File(path).readLines()
        Content(lines)
    } catch (e: FileNotFoundException) {
        shift(FileNotFound(path))
    } catch (e: SecurityException) {
        shift(SecurityError(e.message))
    }
}

suspend fun main() {
    println(readFile("hi 1").toEither())
    println(readFile("").toEither())
    println(readFile2("hi 2").toValidated())
    println(readFile2("").toValidated())
    println(readFile3("hi 3").toIor())
    println(readFile3("").toIor())
}
