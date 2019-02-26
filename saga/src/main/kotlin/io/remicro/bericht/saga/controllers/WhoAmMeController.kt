package io.remicro.bericht.saga.controllers

import io.remicro.bericht.saga.components.JsonMapper
import io.remicro.bericht.saga.dto.Me
import io.vertx.core.http.HttpServerResponse
import io.vertx.ext.web.RoutingContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class WhoAmMeController(
    val name: String = "saga",
    val id: UUID = UUID.randomUUID()
) {

    @Autowired
    lateinit var mapper: JsonMapper

    fun me(ctx: RoutingContext) {
        val enc = mapper.encode(Me(name = name, id = id))
        ctx
            .response()
            .putHeader(Header.ContentType, ContentType.JsonCharsetUTF8)
            .end(enc)
    }
}

 fun HttpServerResponse.putHeader(contentType: Header, json: ContentType): HttpServerResponse {
    putHeader(contentType.value, json.value)
    return this
}
