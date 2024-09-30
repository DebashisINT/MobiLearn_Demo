package com.breezemobilearndemo.features.orderList.model

import com.breezemobilearndemo.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}