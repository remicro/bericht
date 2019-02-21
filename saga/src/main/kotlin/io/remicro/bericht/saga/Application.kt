package io.remicro.bericht.saga

import io.remicro.bericht.saga.verticles.SagaVerticle
import io.vertx.core.Vertx
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import javax.annotation.PostConstruct

@SpringBootApplication
class Application {

    @Autowired
    private lateinit var sagaVerticle: SagaVerticle

    @PostConstruct
    fun deployVerticles() {
        Vertx.vertx().deployVerticle(sagaVerticle)
    }
}
