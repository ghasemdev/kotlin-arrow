package core.datatypes.monoid

import arrow.core.Option
import arrow.core.Some
import arrow.core.foldMap
import arrow.core.identity
import arrow.typeclasses.Monoid

fun <A, B> monoidPair(MA: Monoid<A>, MB: Monoid<B>): Monoid<Pair<A, B>> =
    object : Monoid<Pair<A, B>> {

        override fun Pair<A, B>.combine(b: Pair<A, B>): Pair<A, B> {
            val (thisA, thisB) = this
            val (otherA, otherB) = b
            return Pair(MA.run { thisA.combine(otherA) }, MB.run { thisB.combine(otherB) })
        }

        override fun empty(): Pair<A, B> = Pair(MA.empty(), MB.empty())
    }

val M = monoidPair(Monoid.int(), Monoid.string())
val list = listOf(1, 1)

fun main() {
    println(Monoid.string().run { empty() })
    println(Monoid.string().run { listOf("Λ", "R", "R", "O", "W").fold() })
    println(Monoid.option(Monoid.int()).run { listOf<Option<Int>>(Some(1), Some(1)).fold() })
    println(listOf(1, 2, 3, 4, 5).foldMap(Monoid.int(), ::identity))
    println(listOf(1, 2, 3, 4, 5).foldMap(Monoid.string()) { it.toString() })

    println(list.foldMap(M) { n: Int -> Pair(n, n.toString()) })
}
