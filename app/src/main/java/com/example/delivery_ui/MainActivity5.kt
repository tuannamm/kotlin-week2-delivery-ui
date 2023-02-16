package com.example.delivery_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    lateinit var fullName: String
    lateinit var emailString: String
    lateinit var phoneNumber: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val saveButton: Button = findViewById(R.id.save_button)
        val inputName: EditText = findViewById(R.id.input_name)
        val inputEmail: EditText= findViewById(R.id. input_email)
        val inputPhoneNumber: EditText = findViewById(R.id.input_phone_number)
        val stateName: TextView = findViewById(R.id.state_name)
        val stateEmail: TextView = findViewById(R.id.state_email)
        val statePhoneNumber: TextView = findViewById(R.id.state_phone_number)
        saveButton.setOnClickListener{
            fullName = inputName.text.toString()
            stateName.text = fullName
            emailString = inputEmail.text.toString()
            stateEmail.text = emailString
            phoneNumber = inputPhoneNumber.text.toString()
            statePhoneNumber.text = phoneNumber
            Toast.makeText(this,"Saved!",Toast.LENGTH_LONG).show()
        }
    }


}