package core.totorials.monadComprehensions

import arrow.core.Either
import arrow.core.Either.Right
import arrow.core.flatMap
import arrow.core.continuations.either

suspend fun test(): Either<String, Int> = either {
    val one = Right(1).bind()
    1 + one
}

val x: Either<String, Int> = Right(1)
val result = x.flatMap { one ->
    Right(one + 1)
}

suspend fun main() {
    println(test())
    println(result)
}
