package fx.datatype

import arrow.fx.coroutines.guaranteeCase
import arrow.fx.coroutines.raceN
import kotlinx.coroutines.awaitCancellation

suspend fun main() {
    val winner = raceN({
        guaranteeCase({ awaitCancellation() }) { exitCase ->
            println("I can never win the race. Finished with $exitCase")
        }
    }, {
        "I am going to win, immediately"
    })
    println(winner)
}
