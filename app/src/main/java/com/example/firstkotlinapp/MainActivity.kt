package com.example.firstkotlinapp

import android.app.UiModeManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainClick()

    }
    private val nameList = mutableListOf("name", "hello", "text","!!!")
    private val passList = mutableListOf("123", "123456","!!!")

    private fun mainClick() {
        click_btn.setOnClickListener {
            val userName = username_txt.text.toString().trim()
            val password = password_txt.text.toString().trim()
            UiManager.showToast("$userName $password", this)
            checkUserData(userName, password)
        }
    }

    private fun checkUserData(userName: String, password: String) {
        if (nameList.contains(userName) && passList.contains(password)){
            if (userName == "!!!" && password == "!!!"){
               startActivity(Intent(this,SecondActivity::class.java)
                   .putExtra("boolean",true))

            }
            else{
                startActivity(
                    Intent(this, SecondActivity::class.java)
                        .putExtra("userName", userName)
                        .putExtra("password", password))
            }

        } else UiManager.showToast("ERROR", this)
    }

}
