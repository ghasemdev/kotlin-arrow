package optic.valueDSL.domain

import arrow.core.Option
import arrow.core.andThen
import arrow.optics.Iso
import arrow.optics.PIso
import arrow.optics.optics

data class Point2D(val x: Int, val y: Int)

val pointIsoPair: Iso<Point2D, Pair<Int, Int>> = Iso(
    get = { point -> point.x to point.y },
    reverseGet = { (a, b) -> Point2D(a, b) }
)

data class Coord(val xAxis: Int, val yAxis: Int)

val pairIsoCoord: Iso<Pair<Int, Int>, Coord> = Iso(
    get = { pair -> Coord(pair.first, pair.second) },
    reverseGet = { coord -> coord.xAxis to coord.yAxis }
)

@optics
data class Pos(val x: Int, val y: Int) {
    companion object
}

data class Tuple2<A, B>(val a: A, val b: B) {
    fun reversed(): Tuple2<B, A> = Tuple2(b, a)
}

fun <A, B, C, D> pair(): PIso<Pair<A, B>, Pair<C, D>, Tuple2<A, B>, Tuple2<C, D>> = PIso(
    { (a, b) -> Tuple2(a, b) },
    { (a, b) -> a to b }
)

fun main() {
    val point = Point2D(6, 10)
    println(point)

    val pair = pointIsoPair.get(point)
    println(pair)

    println(pointIsoPair.reverseGet(pair))

    val reversedIso: Iso<Pair<Int, Int>, Point2D> = pointIsoPair.reverse()

    val addFive: (Pair<Int, Int>) -> Pair<Int, Int> = { (a, b) -> (a + 5) to (b + 5) }
    println(pointIsoPair.modify(point, addFive))

    val liftedAddFive: (Point2D) -> Point2D = pointIsoPair.lift(addFive)
    println(liftedAddFive(point))

    val unknownCode: (String) -> String? = { value ->
        "unknown $value"
    }

    val nullableOptionIso: Iso<String?, Option<String>> = PIso.nullableToOption()
    println((unknownCode andThen nullableOptionIso::get)("Retrieve an Option"))

    val iso: Iso<Pos, Pair<Int, Int>> = Pos.iso
    println(iso)

    val reverseTupleAsPair: (Pair<Int, String>) -> Pair<String, Int> =
        pair<Int, String, String, Int>().lift(Tuple2<Int, String>::reversed)

    val reverse: Pair<String, Int> = reverseTupleAsPair(5 to "five")
    println(reverse)
}
