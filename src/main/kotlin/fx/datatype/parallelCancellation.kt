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
            guaranteeCase({
                // Finish immediately
            }) { exitCase -> println("I completed immediately: $exitCase") }
        }, {
            guaranteeCase({
                awaitCancellation()
            }) { exitCase -> println("I never complete: $exitCase") }
        }) { _, _ -> println("I am never called!") }
    }

    delay(50)
    fiber.cancel()
    fiber.await()
}
