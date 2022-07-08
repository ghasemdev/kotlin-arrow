package core.totorials.errorHandling

import arrow.core.continuations.nullable
import arrow.core.getOrElse
import arrow.core.toOption
import kotlin.system.measureTimeMillis

/** model */
object Lettuce
object Knife
object Salad

private fun takeFoodFromRefrigerator(): Lettuce? = null
private fun getKnife(): Knife? = null
fun prepare(tool: Knife, ingredient: Lettuce): Salad? = Salad

/* Fastest Way */
fun prepareLunch1(): Salad? {
    val lettuce = takeFoodFromRefrigerator()
    val knife = getKnife()
    return knife?.let { k -> lettuce?.let { l -> prepare(k, l) } }
}

/* Cleaner Way */
suspend fun prepareLunch2(): Salad? = nullable {
    val lettuce = takeFoodFromRefrigerator().bind()
    val knife = getKnife().bind()
    val salad = prepare(knife, lettuce).bind()
    salad
}

fun prepareLunch3(): Salad? {
    val lettuce = takeFoodFromRefrigerator().toOption()
    val knife = getKnife().toOption()
    return prepare(knife.getOrElse { Knife }, lettuce.getOrElse { Lettuce })
}

suspend fun main() {
    println(measureTimeMillis { prepareLunch1() })
    println(measureTimeMillis { prepareLunch2() })
    println(measureTimeMillis { prepareLunch3() })
}
