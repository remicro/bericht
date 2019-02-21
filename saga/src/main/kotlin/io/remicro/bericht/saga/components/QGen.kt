package io.remicro.bericht.saga.components

import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicGenericQueryExecutor

interface QGen {
    fun DSL(): ReactiveClassicGenericQueryExecutor
}