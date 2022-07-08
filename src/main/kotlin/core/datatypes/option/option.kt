package core.datatypes.option

import arrow.core.*
import arrow.core.continuations.option

val someValue: Option<String> = Some("I am wrapped in something")
val emptyValue: Option<String> = none()

fun maybeItWillReturnSomething(flag: Boolean): Option<String> =
    if (flag) Some("Found value") else None

val value1 = maybeItWillReturnSomething(true).getOrElse { "No value" }
val value2 = maybeItWillReturnSomething(false).getOrElse { "No value" }

val valueSome = maybeItWillReturnSomething(true) is None
val valueNone = maybeItWillReturnSomething(false) is None

val myString: String? = "Nullable string"
val optionValue: Option<String> = Option.fromNullable(myString)

val number: Option<Int> = Some(3)
val noNumber: Option<Int> = None
val mappedResult1 = number.map { it * 1.5 }
val mappedResult2 = noNumber.map { it * 1.5 }

val fold1 = Some(3).fold({ 1 }, { it * 3 })
val fold2 = none<Int>().fold({ 1 }, { it * 3 })

val some = 1.some()
val none = none<String>()

val nullString: String? = null
val valueFromNull = nullString.toOption()

val helloString: String? = "Hello"
val valueFromStr = helloString.toOption()


val value = Some(1).zip(Some("Hello"), Some(20.0), ::Triple)

suspend fun main() {
    println("value = $someValue")
    println("emptyValue = $emptyValue")

    println(value1)
    println(value2)

    println("valueSome = $valueSome")
    println("valueNone = $valueNone")

    println("option = $optionValue")

    println("number = $number")
    println("noNumber = $noNumber")
    println("mappedResult1 = $mappedResult1")
    println("mappedResult2 = $mappedResult2")

    println(fold1)
    println(fold2)

    println("some = $some")
    println("none = $none")

    println("valueFromNull = $valueFromNull")
    println("valueFromStr = $valueFromStr.")

    println(value)

    println(value())
}

suspend fun value(): Option<Int> = option {
    val a = none<Int>().getOrElse { 0 }
    val b = Some(1 + a).bind()
    val c = Some(1 + b).bind()
    a + b + c
}
