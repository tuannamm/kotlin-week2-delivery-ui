package com.example.delivery_ui.screen.LogIn

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.delivery_ui.MainViewModel
import com.example.delivery_ui.R
import com.example.delivery_ui.databinding.ActivityNewBinding
import com.example.delivery_ui.screen.Profile.ProfileActivity
import com.example.delivery_ui.screen.SignUp.registerActivity

class newActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewBinding
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_new)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.initSharedPreferences(this)
        binding.Signup.setOnClickListener{
            val intent = Intent(this, registerActivity ::class.java)
            startActivity(intent)
        }
        binding.buttonLogin.setOnClickListener {
            val email = binding.emailInputText.text.toString()
            val password = binding.passwordInputText.text.toString()
            viewModel.checkEmailAndPassword(this, email, password)
        }

        viewModel.isSuccessEvent.observe(this, { success ->
            if (success) {
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
                finish()
            }
        })

        viewModel.isErrorEvent.observe(this, { error ->
            Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
        })

    }
}
