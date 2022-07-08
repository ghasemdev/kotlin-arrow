package optic.valueDSL.domain

import arrow.core.NonEmptyList
import arrow.core.nel
import arrow.core.nonEmptyListOf
import arrow.optics.Getter
import arrow.optics.Lens
import arrow.optics.PLens

val healthGetter = Getter(Player::health)
val player = Player(75)

fun <T> nonEmptyListHead() = Getter<NonEmptyList<T>, T> {
    it.head
}

val headGetter: Getter<NonEmptyList<String>, String> = Lens.nonEmptyListHead()
val tupleGetter: Getter<Pair<String, Int>, String> = PLens.pairFirst()

fun main() {
    println(healthGetter.get(player))
    println(nonEmptyListHead<Int>().get(nonEmptyListOf(1, 2, 3, 4)))

    val firstBar: Getter<NonEmptyList<Player>, Int> =
        Lens.nonEmptyListHead<Player>() compose healthGetter
    println(firstBar.get(Player(5).nel()))
}
