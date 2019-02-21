package io.remicro.bericht.saga.entities

import java.util.*

data class Scroll(
    val id: UUID,
    val title: String,
    val text: String,
    val vision: Vision
)
