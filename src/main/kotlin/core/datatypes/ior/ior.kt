package core.datatypes.ior

import arrow.core.Ior
import arrow.core.bothIor
import arrow.core.continuations.ior
import arrow.core.getOrElse
import arrow.typeclasses.Semigroup

val x = ("Not a number" to 2).bothIor()
val value = x.getOrElse { -1 }

suspend fun main() {
    println(x)
    println(value)
    println(value())
}

suspend fun value(): Ior<Int, Int> = ior(Semigroup.int()) {
    0
}
