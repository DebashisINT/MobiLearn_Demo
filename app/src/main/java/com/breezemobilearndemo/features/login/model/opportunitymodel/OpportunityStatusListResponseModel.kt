package com.breezemobilearndemo.features.login.model.opportunitymodel

import com.breezemobilearndemo.app.domain.OpportunityStatusEntity
import com.breezemobilearndemo.app.domain.ProductListEntity
import com.breezemobilearndemo.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}