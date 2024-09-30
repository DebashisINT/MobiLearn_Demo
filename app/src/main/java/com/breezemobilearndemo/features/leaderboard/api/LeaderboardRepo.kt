package com.breezemobilearndemo.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezemobilearndemo.app.FileUtils
import com.breezemobilearndemo.app.Pref
import com.breezemobilearndemo.base.BaseResponse
import com.breezemobilearndemo.features.addshop.model.AddLogReqData
import com.breezemobilearndemo.features.addshop.model.AddShopRequestData
import com.breezemobilearndemo.features.addshop.model.AddShopResponse
import com.breezemobilearndemo.features.addshop.model.LogFileResponse
import com.breezemobilearndemo.features.addshop.model.UpdateAddrReq
import com.breezemobilearndemo.features.contacts.CallHisDtls
import com.breezemobilearndemo.features.contacts.CompanyReqData
import com.breezemobilearndemo.features.contacts.ContactMasterRes
import com.breezemobilearndemo.features.contacts.SourceMasterRes
import com.breezemobilearndemo.features.contacts.StageMasterRes
import com.breezemobilearndemo.features.contacts.StatusMasterRes
import com.breezemobilearndemo.features.contacts.TypeMasterRes
import com.breezemobilearndemo.features.dashboard.presentation.DashboardActivity
import com.breezemobilearndemo.features.login.model.WhatsappApiData
import com.breezemobilearndemo.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}