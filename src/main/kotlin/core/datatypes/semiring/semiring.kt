package core.datatypes.semiring

import arrow.typeclasses.Semiring

fun main() {
    println(Semiring.int().run { 1.combine(2) })
    println(Semiring.int().run { 2.combineMultiplicate(3) })
    println(Semiring.int().run { 1 + 2 })
    println(Semiring.int().run { 2 * 3 })
}
