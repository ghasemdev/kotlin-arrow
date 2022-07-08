package optic.collectionDSL

import arrow.optics.cons
import arrow.optics.typeclasses.Cons
import arrow.optics.uncons

fun main() {
    val listFirst = Cons.list<Int>().cons()
    val instance = Cons(listFirst)
    println(instance)

    println(1 cons listOf(2, 3))
    println(listOf(1, 2, 3).uncons())
    println(emptyList<Int>().uncons())
}
