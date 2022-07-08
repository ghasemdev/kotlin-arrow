package optic.collectionDSL

import arrow.optics.Every
import arrow.optics.dsl.at
import arrow.optics.dsl.every
import arrow.optics.dsl.index
import arrow.optics.dsl.some
import arrow.optics.optics
import arrow.optics.typeclasses.At
import arrow.optics.typeclasses.Index
import optic.valueDSL.domain.*
import java.util.*

@optics
data class Employees(val employees: List<Employee>) {
    companion object
}

@optics
data class Db(val content: Map<Int, String>) {
    companion object
}

val jane = Employee(
    "Jane Doe",
    Company("Kategory", Address("Functional city", Street(42, "lambda street")))
)
val employees = Employees(listOf(john, jane))

fun main() {
    // Every
    Employees.employees.every(Every.list()).company.address.street.name
        .modify(employees, String::cap).also { println(it) }
    Every.list<Employee>().run {
        Employees.employees.every.company.address.street.name
            .modify(employees, String::cap).also { println(it) }
    }

    // At
    val db = Db(mapOf(1 to "one", 2 to "two", 3 to "three"))
    Db.content.at(At.map(), 2).some.modify(db, String::reversed).also { println(it) }
    At.map<Int, String>().run {
        Db.content.at(2).some.modify(db, String::reversed).also { println(it) }
    }

    // Index
    val updatedJohn = Employees.employees.index(Index.list(), 0).company.address.street.name
        .modify(employees, String::cap).also { println(it) }
    Index.list<Employee>().run {
        Employees.employees[0].company.address.street.name.getOrNull(updatedJohn)
            .also { println(it) }
    }
    Index.list<Employee>().run {
        Employees.employees[2].company.address.street.name.getOrNull(employees).also { println(it) }
    }
}

fun String.cap() = replaceFirstChar {
    if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
}