package com.breezemobilearndemo.features.location.shopRevisitStatus

import com.breezemobilearndemo.base.BaseResponse
import com.breezemobilearndemo.features.location.model.ShopDurationRequest
import com.breezemobilearndemo.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}