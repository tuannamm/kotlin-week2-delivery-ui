package com.example.delivery_ui.screen.Welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.delivery_ui.R
import com.example.delivery_ui.screen.LogIn.newActivity

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        var btn = findViewById<Button>(R.id.buttonStartWithEmailOrPhone)
        btn.setOnClickListener{
            val intent: Intent = Intent (this, newActivity::class.java)
            startActivity(intent)
        }
    }
}