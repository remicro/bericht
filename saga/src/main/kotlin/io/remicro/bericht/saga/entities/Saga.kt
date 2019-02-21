package io.remicro.bericht.saga.entities

import java.util.*

data class Saga(
    val id: UUID,
    val title: String,
    val ownerId: UUID
)
