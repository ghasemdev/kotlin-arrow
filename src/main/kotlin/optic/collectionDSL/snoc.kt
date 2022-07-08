package optic.collectionDSL

import arrow.optics.snoc
import arrow.optics.typeclasses.Snoc
import arrow.optics.unsnoc

fun main() {
    val listLast = Snoc.list<Int>().snoc()
    val instance = Snoc(listLast)
    println(instance)

    println(listOf(1, 2) snoc 3)
    println(listOf(1, 2, 3).unsnoc())
    println(emptyList<Int>().unsnoc())
}
