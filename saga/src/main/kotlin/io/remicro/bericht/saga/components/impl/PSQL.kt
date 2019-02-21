package io.remicro.bericht.saga.components.impl

import io.reactiverse.pgclient.PgClient
import io.reactiverse.pgclient.PgPool
import io.reactiverse.pgclient.PgPoolOptions
import io.vertx.core.Vertx
import org.jooq.SQLDialect
import org.jooq.impl.DefaultConfiguration
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

private const val PSQL_HOSTNAME = "psql.hostname"
private const val PSQL_PORT = "psql.port"
private const val PSQL_DATABASE = "psql.database"
private const val PSQL_USER = "psql.user"
private const val PSQL_PASSWORD = "psql.password"
private const val PSQL_POOL_SIZE = "psql.pool_size"

@Component
class PSQL(
    @Value("\${$PSQL_HOSTNAME}") private val hostname: String,
    @Value("\${$PSQL_PORT}") private val port: Int,
    @Value("\${$PSQL_DATABASE}") private val database: String,
    @Value("\${$PSQL_USER}") private val user: String,
    @Value("\${$PSQL_PASSWORD}") private val passowrd: String,
    @Value("\${$PSQL_POOL_SIZE}") private val poolSize: Int,
    val vertx: Vertx
) {


    private lateinit var client: PgPool

    @PostConstruct
    fun initiate() {
        val options = PgPoolOptions()
            .setPort(port)
            .setHost(hostname)
            .setPassword(passowrd)
            .setMaxSize(poolSize)
            .setDatabase(database)
            .setUser(user)
        client = PgClient.pool(options)
    }

    @Bean
    fun client() = client
    
    @Bean
    fun conf(): org.jooq.Configuration {
        return DefaultConfiguration().set(SQLDialect.POSTGRES_10)
    }
}