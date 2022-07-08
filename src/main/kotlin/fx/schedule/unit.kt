package fx.schedule

import arrow.fx.coroutines.Schedule

suspend fun main() {
    var counter = 0
    val res = (Schedule.unit<Unit>() zipLeft Schedule.recurs(3)).repeat {
        println("Run: ${counter++}")
    }
    // equal to
    val res2 = (Schedule.recurs<Unit>(3) zipRight Schedule.unit()).repeat {
        println("Run: ${counter++}")
    }
    println(res)
    println(res2)
}