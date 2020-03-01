package com.example.firstkotlinapp.model

import java.io.Serializable

data class Purchase(
    val number: Int,
    val title: String,
    val price: Double,
    val discount: Int,
    val final_price: Double
): Serializable

fun createPurchase(): MutableList<Purchase> {
    return mutableListOf<Purchase>().apply {
        this.add(Purchase(1, "Мандарины", 20.0, 5, getFinalPrice(20.0, 5)))
        this.add(Purchase(2, "Картофель", 15.0, 3, getFinalPrice(15.0, 3)))
        this.add(Purchase(3, "Помидоры", 30.0, 5, getFinalPrice(30.0, 5)))
        this.add(Purchase(4, "Хлеб", 15.0, 0, getFinalPrice(15.0, 0)))
        this.add(Purchase(5, "Сахар", 50.0, 5, getFinalPrice(50.0, 5)))
        this.add(Purchase(6, "Чай", 70.0, 5, getFinalPrice(70.0, 12)))
        this.add(Purchase(7, "Мука пшеничная", 60.0, 8, getFinalPrice(60.0, 8)))
        this.add(Purchase(8, "Кетчуп", 86.0, 7, getFinalPrice(86.0, 7)))
        this.add(Purchase(9, "Туалетная бумага", 20.0, 0, getFinalPrice(20.0, 0)))
        this.add(Purchase(10, "Зуб.паста", 100.0, 7, getFinalPrice(100.0, 7)))
    }
}

fun getFinalPrice(x: Double, y: Int): Double {
    return x - (x / 100 * y)
}