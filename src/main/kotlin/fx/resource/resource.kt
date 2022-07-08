package fx.resource

import arrow.fx.coroutines.continuations.resource
import arrow.fx.coroutines.release

class UserProcessor {
    fun start(): Unit = println("Creating UserProcessor")
    fun shutdown(): Unit = println("Shutting down UserProcessor")
    fun process(ds: DataSource): List<String> =
        ds.users().map { "Processed $it" }
}

class DataSource {
    fun connect(): Unit = println("Connecting dataSource")
    fun users(): List<String> = listOf("User-1", "User-2", "User-3")
    fun close(): Unit = println("Closed dataSource")
}

class Service(val db: DataSource, val userProcessor: UserProcessor) {
    suspend fun processData(): List<String> =
        throw RuntimeException("I'm going to leak resources by not closing them")
}

val userProcessor = resource {
    UserProcessor().also { it.start() }
} release { it.shutdown() }

val dataSource = resource {
    DataSource().also { it.connect() }
} release { it.close() }

suspend fun main() {
    userProcessor.parZip(dataSource) { userProcessor, ds ->
        Service(ds, userProcessor)
    }.use { service ->
        service.processData()
    }
}
