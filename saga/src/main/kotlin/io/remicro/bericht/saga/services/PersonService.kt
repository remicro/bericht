package io.remicro.bericht.saga.services

import io.remicro.saga.entities.tables.pojos.Person
import java.util.*

interface PersonService {
    fun get(uid: UUID): Person
}
