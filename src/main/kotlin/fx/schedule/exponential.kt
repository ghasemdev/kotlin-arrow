package fx.schedule

import arrow.fx.coroutines.Schedule
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.ExperimentalTime

@ExperimentalTime
val exponential = Schedule.exponential<Unit>(250.milliseconds)
