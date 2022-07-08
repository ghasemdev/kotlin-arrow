package optic.valueDSL.domain

import arrow.core.*
import arrow.optics.*

val optionalHead: Optional<List<Int>, Int> = Optional(
    getOption = { list -> list.firstOrNull().toOption() },
    set = { list, int -> list.mapIndexed { index, value -> if (index == 0) int else value } }
)

data class Participant(val name: String, val email: String?)

val participantEmail: Optional<Participant, String> = Optional(
    getOrModify = { participant -> participant.email?.right() ?: participant.left() },
    set = { participant, email -> participant.copy(email = email) }
)

@optics
data class Person(val age: Int?, val address: Address?) {
    companion object
}

val pprism = PPrism.pSome<Pair<Int, String>, Pair<String, String>>()
val plens = PLens.pairPFirst<Int, String, String>()
val somePair: POptional<Option<Pair<Int, String>>, Option<Pair<String, String>>, Int, String> =
    pprism compose plens
val lifted: (Option<Pair<Int, String>>) -> Option<Pair<String, String>> =
    somePair.lift { "Hello, " }

fun main() {
    println(POptional.listHead<Int>().set(listOf(1, 3, 6), 5))
    println(POptional.listHead<Int>().modify(listOf(1, 3, 6)) { head -> head * 5 })
    val lifted = POptional.listHead<Int>().lift { head -> head * 5 }
    lifted(emptyList())

    val optEmail: Optional<Option<Participant>, String> =
        PPrism.some<Participant>() compose participantEmail
    println(optEmail.getOrNull(Some(Participant("test", "email"))))
    println(optEmail.getOrNull(None))
    println(optEmail.getOrNull(Some(Participant("test", null))))

    val optionalAge: Optional<Person, Int> = Person.age
    val optionalAddress: Optional<Person, Address> = Person.address
    println(optionalAge)
    println(optionalAddress)

    lifted(None)
}
