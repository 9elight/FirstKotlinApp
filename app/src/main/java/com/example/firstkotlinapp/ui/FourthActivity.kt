package com.example.firstkotlinapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.model.*
import com.example.firstkotlinapp.utils.UiManager
import kotlinx.android.synthetic.main.activity_fourth.*
import java.util.*

class FourthActivity : AppCompatActivity(), SecondAdapter.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val myPurchaseList = mutableListOf<Purchase>().apply {
            this.add(Purchase(1, "Шоколад", 45.0, 3, getFinalPrice(45.0, 3)))
            this.add(Purchase(2, "Сок", 88.0, 7, getFinalPrice(88.0, 7)))
            this.add(Purchase(3, "Бананы", 115.0, 6, getFinalPrice(115.0, 6)))
            this.add(Purchase(4, "Яблоки", 45.0, 3, getFinalPrice(45.0, 3)))
            this.add(Purchase(5, "Чипсы", 90.0, 5, getFinalPrice(90.0, 5)))
            this.add(Purchase(6, "Вода", 15.0, 0, getFinalPrice(15.0, 0)))
            this.add(Purchase(7, "Макароны", 55.0, 10, getFinalPrice(55.0, 10)))
            this.add(Purchase(8, "Масло", 95.0, 10, getFinalPrice(95.0, 10)))
            this.add(Purchase(9, "Мясо", 260.0, 7, getFinalPrice(260.0, 7)))
            this.add(Purchase(10, "Пиво", 55.0, 3, getFinalPrice(55.0, 3)))
        }

        val list: List<Shop> = mutableListOf<Shop>().apply {
            this.add(
                Shop(
                    "Народный", "Чуй - Белинка"
                    , Date()
                    , getTotal(myPurchaseList)
                    , getTotalDiscounts(myPurchaseList)
                    , myPurchaseList
                )
            )
            this.add(
                Shop(
                    "7 дней", "Советская - Боконбаева"
                    , Date()
                    , getTotal(myPurchaseList)
                    , getTotalDiscounts(myPurchaseList)
                    , myPurchaseList
                )
            )
            this.add(
                Shop(
                    "Фрунзе", "Магистраль - Баха"
                    , Date()
                    , getTotal(purchaseList)
                    , getTotalDiscounts(purchaseList)
                    , purchaseList
                )
            )
            this.add(
                Shop(
                    "7 дней", "Исанова - Боконбаева"
                    , Date()
                    , getTotal(purchaseList)
                    , getTotalDiscounts(purchaseList)
                    , purchaseList
                )
            )
            this.add(
                Shop(
                    "7 дней", "Исанова - Боконбаева"
                    , Date()
                    , getTotal(purchaseList)
                    , getTotalDiscounts(purchaseList)
                    , purchaseList
                )
            )
            this.add(
                Shop(
                    "7 дней", "Исанова - Боконбаева"
                    , Date()
                    , getTotal(purchaseList)
                    , getTotalDiscounts(purchaseList)
                    , purchaseList
                )
            )
            this.add(
                Shop(
                    "7 дней", "Исанова - Боконбаева"
                    , Date()
                    , getTotal(purchaseList)
                    , getTotalDiscounts(purchaseList)
                    , purchaseList
                )
            )
            this.add(
                Shop(
                    "7 дней", "Исанова - Боконбаева"
                    , Date()
                    , getTotal(purchaseList)
                    , getTotalDiscounts(purchaseList)
                    , purchaseList
                )
            )
        }

        val adapter: SecondAdapter = SecondAdapter(list, this)
        rv_fourthActivity.adapter = adapter
    }

    override fun onItemClicked(item: Shop) {
        UiManager.showToast("clicked", this)
        startActivity(
            Intent(this, ThirdActivity::class.java)
                .putExtra("shop", item)
        )
    }
}
