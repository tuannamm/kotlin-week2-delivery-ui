package com.example.delivery_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton: Button = findViewById(R.id.next_button)
        nextButton.setOnClickListener{
            nextPage()
            val intent: Intent = Intent (this, MainActivity2:: class.java)
            startActivity(intent)
        }
    }

    private fun nextPage() {
        Toast.makeText(this, "Loading data...",
            Toast.LENGTH_SHORT).show()
    }


}