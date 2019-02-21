package io.remicro.bericht.saga.repositories.impl

import io.reactiverse.pgclient.PgPool
import io.remicro.bericht.saga.repositories.PersonRepository
import io.remicro.bericht.saga.repositories.exc.DoesNotExist
import io.remicro.saga.entities.tables.daos.PersonDao
import io.remicro.saga.entities.tables.pojos.Person
import io.vertx.kotlin.coroutines.await
import org.jooq.Configuration
import org.springframework.stereotype.Component
import java.util.*

@Component
class ImplPersonRepository(
    psql: PgPool,
    conf: Configuration
) : PersonRepository, PersonDao(conf, psql) {
    override suspend fun findById(id: UUID): Person {
        return findOneById(id).await() ?: throw DoesNotExist()
    }
}
