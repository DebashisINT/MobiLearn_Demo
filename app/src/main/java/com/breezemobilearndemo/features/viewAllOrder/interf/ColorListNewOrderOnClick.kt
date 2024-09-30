package com.breezemobilearndemo.features.viewAllOrder.interf

import com.breezemobilearndemo.app.domain.NewOrderColorEntity
import com.breezemobilearndemo.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}