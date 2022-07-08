package optic.collectionDSL

import arrow.optics.PTraversal

fun main() {
    val traversal: PTraversal<List<Int>, List<String>, Int, String> =
        PTraversal { s, f -> s.map(f) }
    val source = listOf(1, 2, 3, 4)
    val target = traversal.modify(source, Int::toString)
    println(target)
    //

    employees.employees.map { employee ->
        employee.copy(
            company = employee.company?.copy(
                address = employee.company.address.copy(
                    street = employee.company.address.street.copy(
                        name = employee.company.address.street.name.cap()
                    )
                )
            )
        )
    }
}