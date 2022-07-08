package fx.circuitBreaker

import arrow.core.Either
import arrow.fx.coroutines.CircuitBreaker
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds
import kotlin.time.ExperimentalTime

@OptIn(ExperimentalTime::class)
suspend fun main() {
    val circuitBreaker = CircuitBreaker.of(
        maxFailures = 2,
        resetTimeout = 2.seconds,
        exponentialBackoffFactor = 1.2,
        maxResetTimeout = 60.seconds,
    )
    circuitBreaker
        .protectOrThrow { "I am in Closed: ${circuitBreaker.state()}" }
        .also { println(it) }

    println("Service getting overloaded . . .")

    Either.catch { circuitBreaker.protectOrThrow { throw RuntimeException("Service overloaded") } }
        .also { println(it) }
    Either.catch { circuitBreaker.protectOrThrow { throw RuntimeException("Service overloaded") } }
        .also { println(it) }
    circuitBreaker.protectEither { }
        .also { println("I am Open and short-circuit with ${it}. ${circuitBreaker.state()}") }

    println("Service recovering . . .").also { delay(2000) }

    circuitBreaker.protectOrThrow { "I am running test-request in HalfOpen: ${circuitBreaker.state()}" }
        .also { println(it) }
    println("I am back to normal state closed ${circuitBreaker.state()}")
}
