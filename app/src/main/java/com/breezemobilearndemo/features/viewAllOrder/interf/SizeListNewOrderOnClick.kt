package com.breezemobilearndemo.features.viewAllOrder.interf

import com.breezemobilearndemo.app.domain.NewOrderProductEntity
import com.breezemobilearndemo.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}