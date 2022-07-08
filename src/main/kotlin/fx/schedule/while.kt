package fx.schedule

import arrow.fx.coroutines.Schedule

suspend fun main() {
    var counter = 0
    val res = Schedule.doWhile<Int> { it <= 3 }.repeat {
        println("Run: ${counter++}"); counter
    }
    println(res)
}
