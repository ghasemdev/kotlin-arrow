package core.datatypes.nonemptylist

import arrow.core.NonEmptyList
import arrow.core.nel
import arrow.core.nonEmptyListOf
import java.util.*

val value1 = nonEmptyListOf(1, 2, 3, 4, 5) // NonEmptyList<Int>

fun sumNel(nel: NonEmptyList<Int>): Int = nel.foldLeft(0) { acc, n -> acc + n }
val value2 = sumNel(nonEmptyListOf(1, 1, 1, 1))

val value3 = nonEmptyListOf(1, 1, 1, 1).map { it + 1 }

val nelOne: NonEmptyList<Int> = nonEmptyListOf(1, 2, 3)
val nelTwo: NonEmptyList<Int> = nonEmptyListOf(4, 5)
val value4 = nelOne.flatMap { one ->
    nelTwo.map { two ->
        one + two
    }
}

data class Person(val id: UUID, val name: String, val year: Int)

val nelId: NonEmptyList<UUID> = nonEmptyListOf(UUID.randomUUID(), UUID.randomUUID())
val nelName: NonEmptyList<String> = nonEmptyListOf("William Alvin Howard", "Haskell Curry")
val nelYear: NonEmptyList<Int> = nonEmptyListOf(1926, 1900)
val value5 = nelId.zip(nelName, nelYear) { id, name, year ->
    Person(id, name, year)
}

fun main() {
    println(value1)
    println(value1.head)
    println(value2)
    println(value3)
    println(value4)
    println(value5)
    println(10.nel())
}
