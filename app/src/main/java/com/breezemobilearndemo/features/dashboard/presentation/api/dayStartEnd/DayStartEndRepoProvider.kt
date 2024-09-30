package com.breezemobilearndemo.features.dashboard.presentation.api.dayStartEnd

import com.breezemobilearndemo.features.stockCompetetorStock.api.AddCompStockApi
import com.breezemobilearndemo.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}