package io.remicro.bericht.saga.repositories.impl

import io.github.jklingsporn.vertx.jooq.shared.internal.QueryResult
import io.reactiverse.pgclient.PgPool
import io.remicro.bericht.saga.components.QGen
import io.remicro.bericht.saga.repositories.Page
import io.remicro.bericht.saga.repositories.ScrollsRepository
import io.remicro.saga.entities.Tables.SAGA
import io.remicro.saga.entities.Tables.SCROLL
import io.remicro.saga.entities.tables.daos.ScrollDao
import io.remicro.saga.entities.tables.pojos.Scroll
import io.vertx.kotlin.coroutines.await
import org.jooq.Configuration
import java.util.*

class ImplScrollsRepository(
    conf: Configuration,
    val psql: PgPool,
    val qGen: QGen
) : ScrollsRepository, ScrollDao(conf, psql) {
    override suspend fun save(scroll: Scroll): UUID {
        return insertReturningPrimary(scroll).await()
    }

    override suspend fun findByUserIdAndSageId(userId: UUID, sageId: UUID, page: Page): List<Scroll> {
        return qGen.DSL().query {
            it.select(table.asterisk())
                .from(table)
                .join(SAGA).on(SAGA.ID.eq(SCROLL.SAGA_ID))
                .where(SCROLL.SAGA_ID.eq(sageId).and(SAGA.OWNER_ID.eq(userId)))
        }
            .await()
            .asList()
            .map { Scroll().mapFrom(it) }
    }
}


private fun Scroll.mapFrom(qr: QueryResult): Scroll {
    title = qr[SCROLL.TITLE]
    id = qr[SCROLL.ID]
    desc = qr[SCROLL.DESC]
    vision = qr[SCROLL.VISION]
    sagaId = qr[SCROLL.SAGA_ID]
    createdAt = qr[SCROLL.CREATED_AT]
    updatedAt = qr[SCROLL.UPDATED_AT]
    return this
}