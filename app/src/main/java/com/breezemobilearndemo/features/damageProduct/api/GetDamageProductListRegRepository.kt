package com.breezemobilearndemo.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezemobilearndemo.app.FileUtils
import com.breezemobilearndemo.base.BaseResponse
import com.breezemobilearndemo.features.NewQuotation.model.*
import com.breezemobilearndemo.features.addshop.model.AddShopRequestData
import com.breezemobilearndemo.features.addshop.model.AddShopResponse
import com.breezemobilearndemo.features.damageProduct.model.DamageProductResponseModel
import com.breezemobilearndemo.features.damageProduct.model.delBreakageReq
import com.breezemobilearndemo.features.damageProduct.model.viewAllBreakageReq
import com.breezemobilearndemo.features.login.model.userconfig.UserConfigResponseModel
import com.breezemobilearndemo.features.myjobs.model.WIPImageSubmit
import com.breezemobilearndemo.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}