package com.breezemobilearndemo.features.viewAllOrder.interf

import com.breezemobilearndemo.app.domain.NewOrderGenderEntity
import com.breezemobilearndemo.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}