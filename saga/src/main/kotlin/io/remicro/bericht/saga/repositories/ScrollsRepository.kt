package io.remicro.bericht.saga.repositories

import io.remicro.saga.entities.tables.pojos.Scroll
import java.util.*

interface ScrollsRepository {
    suspend fun findByUserIdAndSageId(userId: UUID, sageId: UUID, page: Page = Page(0, 0)): List<Scroll>
    suspend fun save(scroll: Scroll): UUID
}
