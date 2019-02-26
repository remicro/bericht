package io.remicro.bericht.saga.verticles

import io.remicro.bericht.saga.controllers.ContentType
import io.remicro.bericht.saga.controllers.PrepareSagaController
import io.remicro.bericht.saga.controllers.WhoAmMeController
import io.vertx.core.AbstractVerticle
import io.vertx.core.Future
import io.vertx.ext.auth.jwt.JWTAuth
import io.vertx.ext.web.Route
import io.vertx.ext.web.Router
import io.vertx.ext.web.handler.BodyHandler
import io.vertx.ext.web.handler.JWTAuthHandler
import org.springframework.stereotype.Component
 
@Component
class SagaVerticle(
    private val whoAmMeController: WhoAmMeController,
    private val prepareSagaController: PrepareSagaController,
    private val authProvider: JWTAuth
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
        
        router.route("/api/v1/prepare/*").handler(JWTAuthHandler.create(authProvider))
        
        router
            .get("/api/v1/prepare/saga/:saga/scrolls")
            .handler(prepareSagaController::getScrolls)
        
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
