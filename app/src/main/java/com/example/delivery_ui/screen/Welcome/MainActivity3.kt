package com.example.delivery_ui.screen.Welcome

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.delivery_ui.R

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val img = findViewById<ImageView>(R.id.imageNext3)
        img.setOnClickListener {
            val intent: Intent = Intent (this, Welcome::class.java)
            startActivity(intent)

        }
    }
}