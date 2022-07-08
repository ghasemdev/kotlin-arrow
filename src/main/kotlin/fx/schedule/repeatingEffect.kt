package fx.schedule

import arrow.fx.coroutines.Schedule

suspend fun main() {
    var counter = 0
    val res = Schedule.recurs<Unit>(3).repeat {
        println("Run: ${counter++}")
    }
    println(res)
}
