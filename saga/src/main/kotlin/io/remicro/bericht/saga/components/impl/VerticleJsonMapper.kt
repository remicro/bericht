package io.remicro.bericht.saga.components.impl

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import io.remicro.bericht.saga.components.JsonMapper
import org.springframework.stereotype.Component

@Component
class VerticleJsonMapper(
    val mapper: ObjectMapper = ObjectMapper().registerModule(KotlinModule())
) : JsonMapper {
    override fun encode(obj: Any): String {
        return mapper.writeValueAsString(obj)
    }
}
