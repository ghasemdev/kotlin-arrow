package core.totorials.monad

import arrow.core.Either
import arrow.core.Either.Left
import arrow.core.flatMap

object NotFound

class EitherSpeaker {
    fun getTalk(): Either<NotFound, EitherTalk> = Left(NotFound)
}

class EitherTalk {
    fun getConference(): Either<NotFound, EitherConference> = Left(NotFound)
}

class EitherConference {
    fun getCity(): Either<NotFound, City> = Left(NotFound)
}

fun cityToVisit(speaker: EitherSpeaker): Either<NotFound, City> = speaker
    .getTalk()
    .flatMap { x -> x.getConference() }
    .flatMap { x -> x.getCity() }
