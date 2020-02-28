package com.example.firstkotlinapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.utils.UiManager
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setContentView(R.layout.activity_second)

        val userName = intent.getStringExtra("userName")
        val password = intent.getStringExtra("password")
        val action = intent.getBooleanExtra("boolean",false)
        if (action){
            text.gravity = Gravity.CENTER
            val message = "userName: admin \npassword: admin"
            text.text = message
        }else{
            val message = "userName: $userName \npassword: $password"
            text.text = message
        }


        UiManager.showToast(
            "Hello its class from java",
            this
        )
    }
}
