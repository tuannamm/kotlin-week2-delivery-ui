package com.example.delivery_ui

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        var loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener{
            Login()

        }
    }
    private fun Login(){
        var userName = findViewById<EditText>(R.id.user_name)
        var password = findViewById<EditText>(R.id.password)
        if(userName.text.toString().equals(Util.ACCOUNT) && password.text.toString().equals(Util.PASS_WORD)) {
            val builder = android.app.AlertDialog.Builder(this)

            builder.setMessage("Login success!")
                .setPositiveButton("Ok", { dialogInterface: DialogInterface, i: Int -> updateProfile() })
                .show()
        } else {
            val builder = android.app.AlertDialog.Builder(this)

            builder.setMessage("Login failed!")
                .setNegativeButton("Success", { dialogInterface: DialogInterface, i: Int -> goHome()})
                .show()
        }
    }
    private fun goHome() {
        startActivity(Intent(this, MainActivity::class.java))
    }
    private fun updateProfile() {
        startActivity(Intent(this, MainActivity5::class.java))

    }

    object Util {
        const val ACCOUNT = "nttnnam@gmail.com"
        const val PASS_WORD = "hay12341ab"
    }
}