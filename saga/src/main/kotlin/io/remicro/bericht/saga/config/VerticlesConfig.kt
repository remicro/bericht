package io.remicro.bericht.saga.config

import io.vertx.core.Vertx
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class VerticlesConfig {
    @Bean
    fun vertx(): Vertx = Vertx.vertx()
}