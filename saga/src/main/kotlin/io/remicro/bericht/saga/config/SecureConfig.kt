package io.remicro.bericht.saga.config

import io.vertx.core.Vertx
import io.vertx.ext.auth.jwt.JWTAuth
import io.vertx.ext.auth.jwt.JWTAuthOptions
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

private const val SECURE_TYPE = "secure.type"
private const val SECURE_PATH = "secure.path"
private const val SECURE_PASS = "secure.pass"


@Configuration
class SecureConfig(
    @Value("\${$SECURE_TYPE}") private val type: String,
    @Value("\${$SECURE_PATH}") private val path: String,
    @Value("\${$SECURE_PASS}") private val password: String,
    private val vertx: Vertx
) {
    @Bean
    fun provider(): JWTAuth {
        val opts = JWTAuthOptions()
        return JWTAuth.create(vertx, opts)
    }
}