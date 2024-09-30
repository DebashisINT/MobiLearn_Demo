package com.breezemobilearndemo.features.photoReg.present

import com.breezemobilearndemo.app.domain.ProspectEntity
import com.breezemobilearndemo.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}