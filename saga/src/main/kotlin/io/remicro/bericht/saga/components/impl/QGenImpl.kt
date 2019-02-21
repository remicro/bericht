package io.remicro.bericht.saga.components.impl

import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicGenericQueryExecutor
import io.reactiverse.pgclient.PgPool
import io.remicro.bericht.saga.components.QGen
import org.jooq.Configuration
import org.springframework.stereotype.Component


@Component
class QGenImpl(
    private val psql: PgPool,
    private val conf: Configuration
) : QGen {
    override fun DSL(): ReactiveClassicGenericQueryExecutor {
        return ReactiveClassicGenericQueryExecutor(conf, psql)
    }

}