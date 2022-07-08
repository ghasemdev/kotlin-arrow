package optic.collectionDSL

import arrow.optics.Every
import arrow.optics.typeclasses.FilterIndex
import arrow.typeclasses.Monoid

val filterIndexStringByIndex: FilterIndex<List<String>, Int, String> = FilterIndex { p ->
    object : Every<List<String>, String> {
        override fun <R> foldMap(M: Monoid<R>, s: List<String>, map: (String) -> R): R = M.run {
            s.foldIndexed(empty()) { index, acc, a -> if (p(index)) acc.combine(map(a)) else acc }
        }

        override fun modify(s: List<String>, map: (focus: String) -> String): List<String> =
            s.mapIndexed { index, a -> if (p(index)) map(a) else a }
    }
}

fun main() {
    val filter: Every<List<String>, String> = filterIndexStringByIndex.filter { index -> index > 3 }
    println(filter.getAll(listOf("H", "He", "Hel", "Hell", "Hello")))

    FilterIndex.list<Int>().filter { index -> index % 2 == 0 }
        .getAll(listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)).also { println(it) }
}
