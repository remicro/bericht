package io.remicro.bericht.saga.repositories

import io.remicro.saga.entities.tables.pojos.Person
import java.util.*

interface PersonRepository {
    suspend fun findById(id: UUID): Person
}
