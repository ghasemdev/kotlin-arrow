package core.datatypes.either

import arrow.core.*
import arrow.core.continuations.either

val r: Either<Int, Int> = Either.Right(7)
val rightMapLeft = r.mapLeft { it + 1 }
val l: Either<Int, Int> = Either.Left(7)
val leftMapLeft = l.mapLeft { it + 1 }

val swapped = r.swap()

val right7: Either<Int, Int> = 7.right()
val left7: Either<Int, Int> = 7.left()
val leftHello = "hello".left()

val contains7 = right7.contains(7)

val getOr7 = leftHello.getOrElse { 7 }
val getOrWorld = leftHello.getOrHandle { "$it world!" }

val trueCondition = Either.conditionally(true, { "Error" }, { 42 })
val falseCondition = Either.conditionally(false, { "Error" }, { 42 })

val rightFold = right7.fold({ 1 }, { it + 3 })
val leftFold = left7.fold({ 1 }, { it + 3 })

val e: Either<Throwable, Int> = Either.Left(NumberFormatException())
val httpStatusCode = e.getOrHandle {
    when (it) {
        is NumberFormatException -> 400
        else -> 500
    }
}

val leftIfNull = Either.Right(12).leftIfNull { -1 }
val leftIfNull2 = Either.Right(null).leftIfNull { -1 }
val leftIfNull3 = Either.Left(12).leftIfNull { -1 }

val rightIfNotNull = "value".rightIfNotNull { "left" }
val rightIfNotNull2 = null.rightIfNotNull { "left" }
val rightIfNull = "value".rightIfNull { "left" }
val rightIfNull2 = null.rightIfNull { "left" }

suspend fun main() {
    println("rightMapLeft = $rightMapLeft")
    println("leftMapLeft = $leftMapLeft")

    println("swapped = $swapped")

    println(right7)
    println(leftHello)

    println("contains7 = $contains7")

    println("getOr7 = $getOr7")
    println("value = $getOrWorld")

    println(trueCondition)
    println(falseCondition)

    println("right fold = $rightFold")
    println("left fold = $leftFold")

    println("httpStatusCode = $httpStatusCode")

    println(leftIfNull)
    println(leftIfNull2)
    println(leftIfNull3)

    println(rightIfNotNull)
    println(rightIfNotNull2)

    println(rightIfNull)
    println(rightIfNull2)

    println(value())
}

fun foo(x: Boolean) = if (x) 5.some() else none()
suspend fun value(): Either<Int, Int> = either {
    val foo = foo(true).bind { 10 }
    val r = r.bind()
    foo + r
}
