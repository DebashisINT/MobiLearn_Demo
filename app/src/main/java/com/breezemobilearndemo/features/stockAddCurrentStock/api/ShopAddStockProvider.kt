package com.breezemobilearndemo.features.stockAddCurrentStock.api

import com.breezemobilearndemo.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezemobilearndemo.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}