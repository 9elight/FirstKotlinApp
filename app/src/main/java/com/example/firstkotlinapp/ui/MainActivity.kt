package com.example.firstkotlinapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.utils.UiManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainClick()

    }
    private val nameList = mutableListOf("name", "hello", "text","!!!")
    private val passList = mutableListOf("123", "123456","!!!")
    private val namePList = mutableListOf("444", "333", "222")
    private val passPList = mutableListOf("444", "333","222")

    private fun mainClick() {
        click_btn.setOnClickListener {
            val userName = username_txt.text.toString().trim()
            val password = password_txt.text.toString().trim()
            UiManager.showToast(
                "$userName $password",
                this
            )
            checkUserData(userName, password)
        }
    }

    private fun checkUserData(userName: String, password: String) {
        if (namePList.contains(userName) && passPList.contains(password))
            startActivity(
                Intent(this, ThirdActivity::class.java)
                    .putExtra("condition", userName)
            )
        else if (nameList.contains(userName) && passList.contains(password))
            startActivity(
                Intent(this, SecondActivity::class.java)
                    .putExtra("userName", userName)
                    .putExtra("password", password)
            )
        else UiManager.showToast(
            "ERROR",
            this
        )
    }


}
