package optic.collectionDSL

import arrow.optics.typeclasses.Index

fun main() {
    val thirdListItemOptional = Index.list<String>().index(3)

    println(thirdListItemOptional.set(listOf("0", "1", "2", "3"), "newValue"))
    println(thirdListItemOptional.set(listOf("0", "1", "2"), "newValue"))
    println(thirdListItemOptional.setNullable(listOf("0", "1", "2"), "newValue"))
}
