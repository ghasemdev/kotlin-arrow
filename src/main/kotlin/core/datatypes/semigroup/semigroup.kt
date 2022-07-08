package core.datatypes.semigroup

import arrow.core.None
import arrow.core.Option
import arrow.typeclasses.Semigroup

fun main() {
    println(listOf(1, 2) + listOf(3, 4))
    println(Semigroup.int().run { 1.combine(2) })
    println(Semigroup.list<Int>().run { listOf(1, 2, 3).combine(listOf(4, 5, 6)) })
    println(Semigroup.option(Semigroup.int()).run { Option(1).combine(Option(2)) })
    println(Semigroup.option(Semigroup.int()).run { Option(1).combine(None) })
    println(Semigroup.option(Semigroup.int()).run { Option(1) + Option(2) })
}
