package com.breezemobilearndemo.features.location.api

import com.breezemobilearndemo.features.location.shopdurationapi.ShopDurationApi
import com.breezemobilearndemo.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}