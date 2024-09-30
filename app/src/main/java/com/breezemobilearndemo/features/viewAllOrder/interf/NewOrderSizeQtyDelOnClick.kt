package com.breezemobilearndemo.features.viewAllOrder.interf

import com.breezemobilearndemo.app.domain.NewOrderGenderEntity
import com.breezemobilearndemo.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}