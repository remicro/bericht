package io.remicro.bericht.saga.verticles

import io.remicro.bericht.saga.controllers.ContentType
import io.remicro.bericht.saga.controllers.WhoAmMeController
import io.vertx.core.AbstractVerticle
import io.vertx.core.Future
import io.vertx.ext.web.Route
import io.vertx.ext.web.Router
import io.vertx.ext.web.handler.BodyHandler
import org.springframework.stereotype.Component
 
@Component
class SagaVerticle(
    private val whoAmMeController: WhoAmMeController
) : AbstractVerticle() {
    override fun start(startFuture: Future<Void>) {
        val httpServer = vertx.createHttpServer()
        val router = Router.router(vertx)
        
        router
            .route()
            .handler(BodyHandler.create())

        router
            .get("/api/v1/who/am/me")
            .handler(whoAmMeController::me)
            .produces(ContentType.Json)
        
        httpServer.requestHandler(router).listen(8080) {
            if (it.succeeded()) {
                startFuture.complete()
                println("HTTP server started on port 8080")
            } else {
                startFuture.fail(it.cause())
            }
        }
    }
}

private fun Route.produces(contentType: ContentType) = this.produces(contentType.value)
