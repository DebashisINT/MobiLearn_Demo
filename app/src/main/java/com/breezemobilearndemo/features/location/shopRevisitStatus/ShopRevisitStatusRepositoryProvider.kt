package com.breezemobilearndemo.features.location.shopRevisitStatus

import com.breezemobilearndemo.features.location.shopdurationapi.ShopDurationApi
import com.breezemobilearndemo.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}