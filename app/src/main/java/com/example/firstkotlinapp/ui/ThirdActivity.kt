package com.example.firstkotlinapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.model.*
import kotlinx.android.synthetic.main.activity_third.*
import java.util.*

class ThirdActivity : AppCompatActivity() {
    private val namePList = mutableListOf("444", "333", "222")
    private val passPList = mutableListOf("444", "333", "222")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val model: Shop = intent.extras?.get("shop") as Shop
        val myAdapter: Adapter = Adapter(model.purchaseList)

        tv_address_value.text = model.address
        tv_date_value.text = model.date.toString()
        tv_total_value.text = model.total.toString()
        tv_discount_value.text = model.totalDiscounts.toString()
        recyclerView.adapter = myAdapter
    }
}
