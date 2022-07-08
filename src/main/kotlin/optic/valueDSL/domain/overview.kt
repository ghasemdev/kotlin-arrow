package optic.valueDSL.domain

import arrow.optics.optics

@optics
data class Street(val number: Int, val name: String) {
    companion object
}

@optics
data class Address(val city: String, val street: Street) {
    companion object
}

@optics
data class Company(val name: String, val address: Address) {
    companion object
}

@optics
data class Employee(val name: String, val company: Company?) {
    companion object
}

// ------------------------------------------------------------

@optics
sealed class NetworkResult {
    companion object
}

@optics
data class Success(val content: String) : NetworkResult() {
    companion object
}

@optics
sealed class NetworkError : NetworkResult() {
    companion object
}

@optics
data class HttpError(val message: String) : NetworkError() {
    companion object
}

object TimeoutError : NetworkError()

val john = Employee(
    name = "John Doe",
    company = Company(
        name = "Kategory",
        address = Address(
            city = "Functional city",
            street = Street(number = 42, name = "lambda street")
        )
    )
)

fun main() {
    val employee = john.copy(
        company = john.company?.copy(
            address = john.company.address.copy(
                street = john.company.address.street.copy(
                    name = john.company.address.street.name.uppercase()
                )
            )
        )
    )
    println(employee)
    println(Employee.company.address.street.name.modify(john) { it.uppercase() })

    // ----------------------------------------------------
    val networkResult: NetworkResult = HttpError("boom!")
    val f: (String) -> String = String::uppercase

    val result = when (networkResult) {
        is HttpError -> networkResult.copy(f(networkResult.message))
        else -> networkResult
    }
    println(result)
    println(NetworkResult.networkError.httpError.message.modify(networkResult, f))
}
