package com.example.delivery_ui.viewModal

import android.content.Context
import android.content.SharedPreferences

import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {

    private lateinit var sharedPreferences: SharedPreferences

    fun initSharedPreferences(context: Context) {
        sharedPreferences = context.getSharedPreferences("MySharedPreferences", Context.MODE_PRIVATE)
    }

    fun getFullName(): String {
        return sharedPreferences.getString("fullName", "") ?: ""
    }

    fun getEmail(): String {
        return sharedPreferences.getString("email", "") ?: ""
    }
}
