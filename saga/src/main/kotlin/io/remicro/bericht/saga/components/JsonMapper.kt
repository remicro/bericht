package io.remicro.bericht.saga.components

interface JsonMapper {
    fun encode(obj: Any): String
}