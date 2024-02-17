package com.example.ipcd.app.login

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.ipcd.app.home.MainActivity
import com.example.ipcd.R
import com.example.ipcd.UserActivity
import com.example.ipcd.databinding.LoginActivityBinding
import com.google.firebase.firestore.FirebaseFirestore.*

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginActivityBinding

    private val loginViewModel by lazy { ViewModelProvider(this)[LoginViewModel::class.java] }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(
            this, R.layout.login_activity
        )
        binding.lifecycleOwner = this
        binding.viewModel = loginViewModel
        binding.executePendingBindings()

        loginViewModel.loggedInSuccess.observe(this) { isAdmin ->
            isAdmin?.let {
                onLoginSuccess(it)
            }
        }
        loginViewModel.showError.observe(this) {
            if (it != null) {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun onLoginSuccess(isAdmin: Boolean) {
        val intent = if (isAdmin) {
            Intent(this@LoginActivity, MainActivity::class.java)
        } else {
            Intent(this@LoginActivity, UserActivity::class.java)
        }

        startActivity(intent)
        finish()
        Toast.makeText(
            this,
            "Welcome, ${if (isAdmin) "admin" else "user"}!",
            Toast.LENGTH_SHORT
        ).show()
    }
}