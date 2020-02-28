package com.example.firstkotlinapp.utils

import android.content.Context
import android.widget.Toast

 public class UiManager{
     companion object {
         fun showToast(message: String, context: Context) {
             Toast.makeText(context, message, Toast.LENGTH_LONG).show()
         }
     }
}