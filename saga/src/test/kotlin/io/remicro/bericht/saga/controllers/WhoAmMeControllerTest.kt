package io.remicro.bericht.saga.controllers

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import io.remicro.bericht.saga.components.JsonMapper
import io.remicro.bericht.saga.dto.Me
import io.vertx.core.http.HttpServerResponse
import io.vertx.ext.web.RoutingContext
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@ExtendWith(MockitoExtension::class)
@SpringBootTest
internal class WhoAmMeControllerTest(
    @Autowired
    val mapper: JsonMapper,
    @Autowired val
    ctr: WhoAmMeController
) {

    lateinit var expect: Me

    @BeforeEach
    fun beforeTest() {
        expect = Me(name = ctr.name, id = ctr.id)
    }

    @Test
    fun `expect correct serialization structure to json`() {
        val mockResponse = mock<HttpServerResponse> {
            on { putHeader(Header.ContentType.value, ContentType.JsonCharsetUTF8.value) } doReturn it
            on { end(mapper.encode(expect)) }.then { }
        }

        val mock = mock<RoutingContext> {
            on { response() } doReturn mockResponse
        }

        ctr.me(mock)
    }
}
