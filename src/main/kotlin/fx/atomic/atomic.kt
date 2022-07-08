package fx.atomic

import arrow.fx.coroutines.Atomic
import arrow.fx.coroutines.parTraverse

suspend fun main() {
    val count = Atomic(0)
    (0 until 20_000).parTraverse {
        count.update(Int::inc)
    }
    println(count.get())
}
