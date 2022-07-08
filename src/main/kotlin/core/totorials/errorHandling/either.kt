package core.totorials.errorHandling

import arrow.core.Either
import arrow.core.Either.Left
import arrow.core.Either.Right
import arrow.core.continuations.either

sealed class CookingException {
    object NastyLettuce : CookingException()
    object KnifeIsDull : CookingException()
    data class InsufficientAmountOfLettuce(val quantityInGrams: Int) : CookingException()
}
typealias NastyLettuce = CookingException.NastyLettuce
typealias KnifeIsDull = CookingException.KnifeIsDull
typealias InsufficientAmountOfLettuce = CookingException.InsufficientAmountOfLettuce

private fun takeFoodFromRefrigerator(): Either<NastyLettuce, Lettuce> = Right(Lettuce)
private fun getKnife(): Either<KnifeIsDull, Knife> = Right(Knife)
fun lunch(knife: Knife, food: Lettuce): Either<InsufficientAmountOfLettuce, Salad> =
    Left(InsufficientAmountOfLettuce(5))

suspend fun prepareEither(): Either<CookingException, Salad> = either {
    val lettuce = takeFoodFromRefrigerator().bind()
    val knife = getKnife().bind()
    val salad = lunch(knife, lettuce).bind()
    salad
}

suspend fun main() {
    println(prepareEither())
}
