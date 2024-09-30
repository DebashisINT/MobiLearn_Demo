package com.breezemobilearndemo.features.nearbyuserlist.api

import com.breezemobilearndemo.app.Pref
import com.breezemobilearndemo.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezemobilearndemo.features.newcollection.model.NewCollectionListResponseModel
import com.breezemobilearndemo.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}