package fx.datatype

import arrow.fx.coroutines.guaranteeCase
import arrow.fx.coroutines.parZip
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

tailrec suspend fun sleeper() {
    println("I am sleepy. I'm going to nap")
    parZip(                                   // <-- cancellation check-point
        { Thread.currentThread().name },
        { Thread.currentThread().name }
    ) { a, b -> println("A on $a, B on $b") }
    println("Too short nap.. Going to sleep some more")
    sleeper()                                // <-- cancellation check-point
}

suspend fun main() = coroutineScope {
    val fiber = async {
        guaranteeCase({ sleeper() }) { exitCase ->
            println("Somebody woke me up with $exitCase")
        }
    }
    delay(100)
    fiber.cancel()
}
