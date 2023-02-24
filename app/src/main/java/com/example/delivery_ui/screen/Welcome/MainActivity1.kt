package com.example.delivery_ui.screen.Welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.delivery_ui.R
import com.example.delivery_ui.screen.Welcome.MainActivity2

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        val img = findViewById<ImageView>(R.id.imageNext1)
        img.setOnClickListener {
            val intent: Intent = Intent (this, MainActivity2::class.java)
            startActivity(intent)

        }
    }
}