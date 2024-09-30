package com.breezemobilearndemo.features.newcollectionreport

import com.breezemobilearndemo.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}