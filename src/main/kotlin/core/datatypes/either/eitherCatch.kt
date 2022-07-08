package core.datatypes.either

import arrow.core.Either

fun potentialThrowingCode(): String = throw RuntimeException("Blow up!")

fun makeSureYourLogicDoesNotHaveSideEffects(): Either<Error2, String> =
    Either.catch { potentialThrowingCode() }.mapLeft { Error2.SpecificError }

fun main() {
    println(
        "makeSureYourLogicDoesNotHaveSideEffects().isLeft() = " +
                "${makeSureYourLogicDoesNotHaveSideEffects().isLeft()}"
    )
}

sealed class Error2 {
    object SpecificError : Error2()
}
