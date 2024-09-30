package com.breezemobilearndemo.features.viewAllOrder.model

import com.breezemobilearndemo.app.domain.NewOrderColorEntity
import com.breezemobilearndemo.app.domain.NewOrderGenderEntity
import com.breezemobilearndemo.app.domain.NewOrderProductEntity
import com.breezemobilearndemo.app.domain.NewOrderSizeEntity
import com.breezemobilearndemo.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

