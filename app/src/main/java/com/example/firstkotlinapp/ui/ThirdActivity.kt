package com.example.firstkotlinapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.model.MockModel
import com.example.firstkotlinapp.model.createMockModel
import com.example.firstkotlinapp.utils.UiManager
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    private val namePList = mutableListOf("444", "333", "222")
    private val passPList = mutableListOf("444", "333","222")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val model: List<MockModel> = createMockModel();
        val myAdapter: Adapter = Adapter(model[0].purchaseList)
        tv_address_value.text = model[0].address
        tv_date_value.text = model[0].date.toString()
        tv_total_value.text = model[0].total.toString()
        tv_discount_value.text = model[0].totalDiscounts.toString()
        recyclerView.adapter = myAdapter


    }
}
