package com.breezemobilearndemo.features.viewAllOrder.orderOptimized

import com.breezemobilearndemo.app.domain.ProductOnlineRateTempEntity
import com.breezemobilearndemo.base.BaseResponse
import com.breezemobilearndemo.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}