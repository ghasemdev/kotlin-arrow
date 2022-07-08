package core.totorials.monadComprehensions

import arrow.core.Either
import arrow.core.Either.Left
import arrow.core.continuations.either
import arrow.core.flatMap
import arrow.core.right
import kotlin.system.measureTimeMillis

/* A simple model of student and a university */
object NotFound
data class Name(val value: String)
data class UniversityId(val value: String)
data class University(val name: Name, val deanName: Name)
data class Student(val name: Name, val universityId: UniversityId)
data class Dean(val name: Name)

/* in memory db of students */
private val students = mapOf(
    Name("Alice") to Student(Name("Alice"), UniversityId("UCA"))
)

/* in memory db of universities */
private val universities = mapOf(
    UniversityId("UCA") to University(Name("UCA"), Name("James"))
)

/* in memory db of deans */
private val deans = mapOf(
    Name("James") to Dean(Name("James"))
)

/* gets a student by name */
fun student(name: Name): Either<NotFound, Student> =
    students[name]?.right() ?: Left(NotFound)

/* gets a university by id */
fun university(id: UniversityId): Either<NotFound, University> =
    universities[id]?.right() ?: Left(NotFound)

/* gets a dean by name */
fun dean(name: Name): Either<NotFound, Dean> =
    deans[name]?.right() ?: Left(NotFound)

suspend fun main() {
    var dean: Either<NotFound, Dean>
    val deanTime = measureTimeMillis {
        dean = student(Name("Alice")).flatMap { alice ->
            university(alice.universityId).flatMap { university ->
                dean(university.deanName)
            }
        }
    }
    println("time :$deanTime -> dean :$dean")

    val dean2Time = measureTimeMillis {
        dean = either {
            val alice = student(Name("Alice")).bind()
            val uca = university(alice.universityId).bind()
            dean(uca.deanName).bind()
        }
    }
    println("time :$dean2Time -> dean :$dean")
}
