package io.remicro.bericht.saga.entities

import java.util.*

data class Screen(
    val id: UUID,
    val ownerId: UUID,
    val original: String,
    val scaled: String
)
