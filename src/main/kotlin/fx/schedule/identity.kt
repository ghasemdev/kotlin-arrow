package fx.schedule

import arrow.fx.coroutines.Schedule

suspend fun main() {
    var counter = 0
    val res = (Schedule.identity<Int>() zipLeft Schedule.recurs(3)).repeat {
        println("Run: ${counter++}"); counter
    }
    // equal to
    val res2 = (Schedule.recurs<Int>(3) zipRight Schedule.identity()).repeat {
        println("Run: ${counter++}"); counter
    }
    println(res)
    println(res2)
}
