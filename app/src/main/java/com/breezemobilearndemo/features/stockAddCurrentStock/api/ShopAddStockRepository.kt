package com.breezemobilearndemo.features.stockAddCurrentStock.api

import com.breezemobilearndemo.base.BaseResponse
import com.breezemobilearndemo.features.location.model.ShopRevisitStatusRequest
import com.breezemobilearndemo.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezemobilearndemo.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezemobilearndemo.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezemobilearndemo.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}