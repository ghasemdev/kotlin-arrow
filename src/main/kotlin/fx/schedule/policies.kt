package fx.schedule

import arrow.fx.coroutines.Schedule
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds
import kotlin.time.ExperimentalTime

fun <A> recurTenTimes() = Schedule.recurs<A>(10)

@OptIn(ExperimentalTime::class)
fun <A> complexPolicy(): Schedule<A, List<A>> =
    Schedule.exponential<A>(10.milliseconds)
        .whileOutput { it.inWholeNanoseconds < 60.seconds.inWholeNanoseconds }
        .andThen(Schedule.spaced<A>(60.seconds) and Schedule.recurs(100))
        .jittered()
        .zipRight(Schedule.identity<A>().collect())
