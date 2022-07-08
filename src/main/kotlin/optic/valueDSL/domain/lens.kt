package optic.valueDSL.domain

import arrow.optics.Lens
import arrow.optics.optics
import java.util.*

data class Player(val health: Int)

val playerLens: Lens<Player, Int> = Lens(
    get = { player -> player.health },
    set = { player, value -> player.copy(health = value) }
)

@optics
data class Account(val balance: Int, val available: Int) {
    companion object
}

fun main() {
    val player = Player(70)
    println(playerLens.get(player))
    println(playerLens.set(player, 100))
    println(playerLens.modify(player) { it - 20 })
    val lift: (Player) -> Player = playerLens.lift { it + 10 }
    println(lift(player))

    println(Employee.company.address.street.name.modify(john) { it.capitalize() })

    val balanceLens: Lens<Account, Int> = Account.balance
    println(balanceLens)
}

/**
 * Returns a copy of this string having its first letter titlecased using the rules of the default locale,
 * or the original string if it's empty or already starts with a title case letter.
 *
 * The title case of a character is usually the same as its upper case with several exceptions.
 * The particular list of characters with the special title case form depends on the underlying platform.
 *
 * Example:
 * ```Kotlin
 * val name = "john"
 * name.capitalize() // John
 * ```
 */
fun String.capitalize() = replaceFirstChar {
    if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
}
