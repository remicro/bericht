package io.remicro.bericht.saga.controllers

import io.remicro.bericht.saga.components.JsonMapper
import io.remicro.bericht.saga.repositories.exc.DoesNotExist
import io.remicro.bericht.saga.repositories.exc.RequiredAuthorize
import io.vertx.ext.web.RoutingContext
import org.springframework.stereotype.Component
import java.util.*

@Component
class PrepareSagaController(
    val mapper: JsonMapper
) {
    fun getScrolls(ctx: RoutingContext) {
        val sagaId = UUID.fromString(ctx.request().getParam("saga"))
        val userId = ctx.user().principal().getString("user_id") ?: throw RequiredAuthorize()
        
        
        val enc = mapper.encode(PreparingScrolls(sagaId))
        
        ctx
            .response()
            .putHeader(Header.ContentType, ContentType.JsonCharsetUTF8)
            .end(enc)
    }
}

data class PreparingScrolls(
    val sagaId: UUID
)