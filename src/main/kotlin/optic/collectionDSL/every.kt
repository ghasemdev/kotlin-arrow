package optic.collectionDSL

import arrow.optics.Every
import arrow.optics.Fold
import arrow.optics.PEvery
import arrow.optics.Traversal
import arrow.typeclasses.Monoid

val every: Every<List<Int>, Int> = Every.from(Traversal.list(), Fold.list())

fun main() {
    println(every.lastOrNull(listOf(1, 2, 3)))
    println(every.lastOrNull(emptyList()))
}

fun <A> PEvery.Companion.list(): Every<List<A>, A> = object : Every<List<A>, A> {
    override fun <R> foldMap(M: Monoid<R>, s: List<A>, map: (A) -> R): R =
        M.run { s.fold(empty()) { acc, a -> acc.combine(map(a)) } }

    override fun modify(s: List<A>, map: (focus: A) -> A): List<A> = s.map(map)
}
