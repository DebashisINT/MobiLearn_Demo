package com.breezemobilearndemo.features.viewAllOrder.interf

import com.breezemobilearndemo.app.domain.NewOrderGenderEntity
import com.breezemobilearndemo.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}