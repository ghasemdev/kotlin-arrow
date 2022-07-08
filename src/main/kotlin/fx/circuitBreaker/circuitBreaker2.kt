package fx.circuitBreaker

import arrow.core.Either
import arrow.fx.coroutines.CircuitBreaker
import arrow.fx.coroutines.Schedule
import arrow.fx.coroutines.retry
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds
import kotlin.time.ExperimentalTime

@ExperimentalTime
suspend fun main() {
    fun apiCall() {
        println("apiCall . . .")
        throw RuntimeException("Overloaded service")
    }

    val circuitBreaker = CircuitBreaker.of(
        maxFailures = 2,
        resetTimeout = 2.seconds,
        exponentialBackoffFactor = 2.0, // enable exponentialBackoffFactor
        maxResetTimeout = 60.seconds, // limit exponential back-off time
    )

    suspend fun <A> resilient(schedule: Schedule<Throwable, *>, f: suspend () -> A): A =
        schedule.retry { circuitBreaker.protectOrThrow(f) }

    Either.catch {
        resilient(Schedule.recurs(5), ::apiCall)
    }.let {
        println("recurs(5) apiCall twice and 4x short-circuit result from CircuitBreaker: $it")
    }

    delay(2000)
    println("CircuitBreaker ready to half-open")

    // Retry once and when the CircuitBreaker opens after 2 failures then retry with
    // exponential back-off with same time as CircuitBreaker's resetTimeout
    val fiveTimesWithBackOff = Schedule.recurs<Throwable>(1) andThen
            Schedule.exponential(2.seconds) and Schedule.recurs(5)

    Either.catch {
        resilient(fiveTimesWithBackOff, ::apiCall)
    }.let {
        println("exponential(seconds(2)) and recurs(5) always retries with actual apiCall: $it")
    }
}
