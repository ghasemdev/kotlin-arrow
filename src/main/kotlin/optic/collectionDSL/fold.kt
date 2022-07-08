package optic.collectionDSL

import arrow.core.NonEmptyList
import arrow.core.nonEmptyListOf
import arrow.optics.Fold
import arrow.typeclasses.Monoid

fun <T> nullableFold(): Fold<T?, T> = object : Fold<T?, T> {
    override fun <R> foldMap(M: Monoid<R>, s: T?, f: (T) -> R): R = s?.let(f) ?: M.empty()
}

fun main() {
    println(nullableFold<Int>().isEmpty(null))
    println(Fold.nonEmptyList<Int>().fold(Monoid.int(), nonEmptyListOf(1, 2, 3)))
    println(nullableFold<Int>().firstOrNull(null))
    println(Fold.nonEmptyList<Int>().firstOrNull(nonEmptyListOf(1, 2, 3, 4)))

    val nestedNelFold: Fold<NonEmptyList<NonEmptyList<Int>>, NonEmptyList<Int>> =
        Fold.nonEmptyList()
    val nestedNel = nonEmptyListOf(1, 2, 3, 4).map {
        nonEmptyListOf(it, it)
    }
    (nestedNelFold compose Fold.nonEmptyList()).getAll(nestedNel).also { println(it) }
}
