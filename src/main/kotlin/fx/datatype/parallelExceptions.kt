package fx.datatype

import arrow.fx.coroutines.guaranteeCase
import arrow.fx.coroutines.parZip
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitCancellation
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

suspend fun main() = coroutineScope {
    val fiber = async {
        parZip({
            delay(100)
            throw RuntimeException("Boom")
        }, {
            guaranteeCase({
                awaitCancellation()
            }) { exitCase -> println("I never complete: $exitCase") }
        }) { _, _ -> println("I am never called!") }
    }

    delay(200) // Wait until after task 1 threw
    fiber.await()
}
