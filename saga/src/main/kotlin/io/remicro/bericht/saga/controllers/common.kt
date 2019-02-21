package io.remicro.bericht.saga.controllers

enum class ContentType(val value: String) {
    Json("application/json"),
    JsonCharsetUTF8("application/json; charset=utf-8")
}

enum class Header(val value: String) {
    ContentType("Content-Type")
}