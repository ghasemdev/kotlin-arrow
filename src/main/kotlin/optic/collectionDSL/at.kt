package optic.collectionDSL

import arrow.core.none
import arrow.core.some
import arrow.optics.typeclasses.At

fun main() {
    val mapAt = At.map<Int, String>().at(2)

    val map = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )

    println(mapAt.set(map, "new value".some()))
    println(mapAt.set(map, none()))
}
