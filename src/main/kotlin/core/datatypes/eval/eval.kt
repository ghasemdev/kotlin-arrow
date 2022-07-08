package core.datatypes.eval

import arrow.core.Eval
import kotlin.system.measureTimeMillis

fun even(n: Int): Eval<Boolean> =
    Eval.always { n == 0 }.flatMap {
        if (it) Eval.now(true)
        else odd(n - 1)
    }

fun odd(n: Int): Eval<Boolean> =
    Eval.always { n == 0 }.flatMap {
        if (it) Eval.now(false)
        else even(n - 1)
    }

/*
This method raise StackOverFlow Exception
fun even(n: Int): Boolean = if (n == 0) true else odd(n - 1)
fun odd(n: Int): Boolean = if (n == 0) true else even(n - 1)
*/

fun main() {
    // Now
    val eager = Eval.now(1).map { it + 1 }
    println(eager.value())
    // Always
    val alwaysEvaled = Eval.always { "expensive computation" }
    println(alwaysEvaled.value())
    // Later
    val lazyEvaled = Eval.later { "expensive computation" }
    println(lazyEvaled.value())
    // Defer
    val deferEvaled = Eval.defer { eager }
    println(deferEvaled.value())

    val time = measureTimeMillis {
        println(odd(100000).value())
    }
    println("Execute Time : $time")
}
