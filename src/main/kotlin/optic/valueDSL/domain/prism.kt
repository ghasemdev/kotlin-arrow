package optic.valueDSL.domain

import arrow.core.*
import arrow.optics.Prism
import arrow.optics.optics

sealed class NetworkResult2 {
    data class Success(val content: String) : NetworkResult2()
    object Failure : NetworkResult2()
}

val networkSuccessPrism: Prism<NetworkResult2, NetworkResult2.Success> = Prism(
    getOrModify = { networkResult ->
        when (networkResult) {
            is NetworkResult2.Success -> networkResult.right()
            else -> networkResult.left()
        }
    },
    reverseGet = { networkResult -> networkResult } //::identity
)

val doubleToInt: Prism<Double, Int> = Prism(
    getOption = { double: Double ->
        val i = double.toInt()
        if (i.toDouble() == double) Some(i) else none()
    },
    reverseGet = Int::toDouble
)


val successToInt: Prism<NetworkResult2.Success, Int> = Prism(
    getOption = { success -> success.content.toIntOrNull().toOption() },
    reverseGet = NetworkResult2::Success compose Int::toString
)
val networkInt: Prism<NetworkResult2, Int> = networkSuccessPrism compose successToInt

@optics
sealed class Shape {
    data class Circle(val radius: Double) : Shape()
    data class Rectangle(val width: Double, val height: Double) : Shape()
    companion object
}

fun main() {
    val networkResult = NetworkResult2.Success("content")
    println(networkSuccessPrism.modify(networkResult) { success ->
        success.copy(content = "different content")
    })
    val lifted: (NetworkResult2) -> NetworkResult2 = networkSuccessPrism.lift { success ->
        success.copy(content = "different content")
    }
    println(lifted(NetworkResult2.Failure))

    println(networkInt.getOrNull(NetworkResult2.Success("invalid int")))
    println(networkInt.getOrNull(NetworkResult2.Failure))
    println(networkInt.getOrNull(NetworkResult2.Success("5")))

    val circleShape: Prism<Shape, Shape.Circle> = Shape.circle
    val rectangleShape: Prism<Shape, Shape.Rectangle> = Shape.rectangle
}
