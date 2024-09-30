package com.breezemobilearndemo.features.stockCompetetorStock.api

import com.breezemobilearndemo.base.BaseResponse
import com.breezemobilearndemo.features.orderList.model.NewOrderListResponseModel
import com.breezemobilearndemo.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezemobilearndemo.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}