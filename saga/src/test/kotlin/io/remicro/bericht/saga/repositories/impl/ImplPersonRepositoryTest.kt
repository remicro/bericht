package io.remicro.bericht.saga.repositories.impl

import io.reactiverse.kotlin.pgclient.preparedQueryAwait
import io.reactiverse.pgclient.PgPool
import io.reactiverse.pgclient.Tuple
import io.remicro.bericht.saga.repositories.exc.DoesNotExist
import io.remicro.saga.entities.tables.pojos.Person
import kotlinx.coroutines.runBlocking
import org.jooq.Configuration
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@ExtendWith(SpringExtension::class)
@SpringBootTest
internal class ImplPersonRepositoryTest(
    @Autowired val pgPool: PgPool,
    @Autowired val conf: Configuration
) {

    private lateinit var repo: ImplPersonRepository
    private lateinit var expect: Person

    @Test
    fun `expect found person`() {
        val person = runBlocking {
            repo.findById(expect.id)
        }
        assertEquals(expect.id, person.id)
        assertEquals(expect.nickName, person.nickName)
        assertEquals(expect.userId, person.userId)
    }

    @Test
    fun `expect not found person`() {
        val e: Exception? = runBlocking {
            try {
                repo.findById(UUID.randomUUID())
                IllegalArgumentException()
            } catch (e: Exception) {
                e
            }
        }
        assertTrue { e is DoesNotExist }
    }

    @BeforeEach
    fun beforeTest() {
        repo = ImplPersonRepository(psql = pgPool, conf = conf)
        val p = Person()
            .setNickName(UUID.randomUUID().toString())
            .setUserId(UUID.randomUUID().toString())

        runBlocking {
            //language=PostgreSQL
            val res = pgPool.preparedQueryAwait(
                "INSERT INTO person (nick_name, user_id) VALUES ($1, $2) RETURNING id",
                Tuple.of(p.nickName, p.userId)
            )
            expect = p.setId(res.single().getUUID(0))
        }
    }

    @AfterEach
    fun afterTest() {
        runBlocking {
            //language=PostgreSQL
            pgPool.preparedQueryAwait("DELETE FROM person WHERE id = $1", Tuple.of(expect.id))
        }
    }
}