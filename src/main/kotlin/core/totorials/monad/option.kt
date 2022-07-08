package core.totorials.monad

import arrow.core.Option
import arrow.core.None
import arrow.core.continuations.option

data class Customer(val addressId: Int)
data class Address(val id: Int, val lastOrder: Option<Order> = None)
data class Order(val id: Int, val shipper: Shipper = Shipper)
object Shipper

interface OptionRepository {
    fun getCustomer(id: Int): Option<Customer> = None
    fun getAddress(id: Int): Option<Address> = None
    fun getOrder(id: Int): Option<Order> = None
}

suspend fun OptionRepository.shipperOfLastOrderOnCurrentAddress(customerId: Int): Option<Shipper> =
    option {
        val customer = getCustomer(customerId).bind()
        val address = getAddress(customer.addressId).bind()
        val lastOrder = address.lastOrder.bind()
        val order = getOrder(lastOrder.id).bind()
        order.shipper
    }