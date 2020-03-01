package com.example.firstkotlinapp.model

import java.io.Serializable
import java.util.*
import kotlin.math.roundToInt

data class Shop (
    val shopName: String,
    val address: String,
    val date: Date,
    val total: Int,
    val totalDiscounts: Int,
    val purchaseList: List<Purchase>
) : Serializable
val purchaseList: List<Purchase> = createPurchase()
fun getTotal(purchaseList: List<Purchase>): Int{
    var totalPrice: Int = 0
    for (element in purchaseList) totalPrice += element.final_price.toInt()
    return totalPrice
}
fun getTotalDiscounts(purchaseList: List<Purchase>): Int {
    var totalPrice: Double = 0.0
    for (element in purchaseList) totalPrice += element.price - element.final_price
    return totalPrice.roundToInt()
}



