package io.remicro.bericht.saga.repositories.impl

import io.reactiverse.kotlin.pgclient.preparedQueryAwait
import io.reactiverse.pgclient.PgPool
import io.reactiverse.pgclient.Tuple
import io.remicro.bericht.saga.components.QGen
import io.remicro.bericht.saga.repositories.ScrollsRepository
import io.remicro.saga.entities.tables.pojos.Person
import io.remicro.saga.entities.tables.pojos.Saga
import io.remicro.saga.entities.tables.pojos.Scroll
import kotlinx.coroutines.runBlocking
import org.jooq.Configuration
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.sql.Timestamp
import java.util.*
import kotlin.test.assertEquals

@SpringBootTest
internal class ImplScrollsRepositoryTest(
    @Autowired val pgPool: PgPool,
    @Autowired val conf: Configuration,
    @Autowired val qGen: QGen
) {
    private lateinit var repo: ScrollsRepository
    private lateinit var scroll: Scroll
    private lateinit var saga: Saga
    private lateinit var person: Person


    @Test
    fun `expect save method for scroll is correct working`() = runBlocking {
        //language=PostgreSQL
        val q = """
            SELECT 
              scroll.id, 
              scroll."desc", 
              scroll.title, 
              scroll.vision,
              scroll.saga_id
            FROM scroll WHERE id=$1
        """.trimIndent()
        val res = pgPool.preparedQueryAwait(q, Tuple.of(scroll.id)).single()
        val fromDb = Scroll()
            .setId(res.getUUID(0))
            .setDesc(res.getString(1))
            .setTitle(res.getString(2))
            .setVision(res.getInteger(3))
            .setSagaId(res.getUUID(4))

        assertEquals(scroll.id, fromDb.id)
        assertEquals(scroll.title, fromDb.title)
        assertEquals(scroll.vision, fromDb.vision)
        assertEquals(scroll.desc, fromDb.desc)
        assertEquals(scroll.sagaId, fromDb.sagaId)
        assertEquals(scroll.desc, fromDb.desc)
    }

    @Test
    fun `expect find scroll from database`() = runBlocking {
        val list = repo.findByUserIdAndSageId(person.id, saga.id)
        assertEquals(list.size, 1)
        //assertEquals(listOf(scroll), list)
    }

    @BeforeEach
    fun prepare() {
        person = Person()
            .setNickName(UUID.randomUUID().toString())
            .setUserId(UUID.randomUUID().toString())
        saga = Saga()
            .setTitle(UUID.randomUUID().toString())
            .setOwnerId(person.id)

        runBlocking {
            //language=PostgreSQL
            val personRow = pgPool.preparedQueryAwait(
                "INSERT INTO person (nick_name, user_id) VALUES ($1, $2) RETURNING id, created_at, updated_at",
                Tuple.of(person.nickName, person.userId)
            ).single()
            person.id = personRow.getUUID(0)
            person.createdAt = Timestamp.valueOf(personRow.getLocalDateTime(1))
            person.updatedAt = Timestamp.valueOf(personRow.getLocalDateTime(2))

            saga.ownerId = person.id
            val sagaRow = pgPool.preparedQueryAwait(
                "INSERT INTO saga (title, owner_id) VALUES ($1, $2) RETURNING id, created_at, updated_at",
                Tuple.of(saga.title, saga.ownerId)
            ).single()
            saga.id = sagaRow.getUUID(0)
            saga.createdAt = Timestamp.valueOf(sagaRow.getLocalDateTime(1))
            saga.updatedAt = Timestamp.valueOf(sagaRow.getLocalDateTime(2))
        }
        repo = ImplScrollsRepository(conf, pgPool, qGen)

        scroll = Scroll()
            .setSagaId(saga.id)
            .setTitle(UUID.randomUUID().toString())
            .setDesc(UUID.randomUUID().toString())

        runBlocking {
            scroll.id = repo.save(scroll = scroll)
        }
    }

    @AfterEach
    fun delete() {
        runBlocking {
            //language=PostgreSQL
            pgPool.preparedQueryAwait("DELETE FROM scroll WHERE id = $1", Tuple.of(scroll.id))
            //language=PostgreSQL
            pgPool.preparedQueryAwait("DELETE FROM saga WHERE id = $1", Tuple.of(saga.id))
            //language=PostgreSQL
            pgPool.preparedQueryAwait("DELETE FROM person WHERE id = $1", Tuple.of(person.id))
        }
    }

    @Test
    fun findByUserIdAndSageId() {

    }
}