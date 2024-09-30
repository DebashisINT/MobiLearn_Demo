package com.breezemobilearndemo.features.login.model.productlistmodel

import com.breezemobilearndemo.app.domain.ModelEntity
import com.breezemobilearndemo.app.domain.ProductListEntity
import com.breezemobilearndemo.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}