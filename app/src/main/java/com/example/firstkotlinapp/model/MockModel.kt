package com.example.firstkotlinapp.model

import java.util.*
import kotlin.math.roundToInt

data class MockModel(
    val address: String,
    val date: Date,
    val total: Int,
    val totalDiscounts: Int,
    val purchaseList: List<Purchase>
)
val purchaseList: List<Purchase> = createPurchase()
fun createMockModel(): MutableList<MockModel> {
    return mutableListOf<MockModel>().apply {
        this.add(MockModel("Белинка - пр.Мира", Date(), getTotal(), getTotalDiscounts(), purchaseList))
    }

}

fun getTotal(): Int{
    var totalPrice: Int = 0
    for (element in purchaseList) totalPrice += element.final_price.toInt()
    return totalPrice
}
fun getTotalDiscounts(): Int {
    var totalPrice: Double = 0.0
    for (element in purchaseList) totalPrice += element.price - element.final_price
    return totalPrice.roundToInt()
}



