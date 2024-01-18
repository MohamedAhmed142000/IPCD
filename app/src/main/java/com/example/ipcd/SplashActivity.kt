package com.example.ipcd
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat



class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Simulate a delay or perform any initialization here
        // For example, you can load necessary data or set up configurations
        window.statusBarColor = ContextCompat.getColor(this, R.color.splash_status_color)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val i = Intent(applicationContext, LoginActivity::class.java)
            startActivity(i)
            finish()
        }, 2000)

    }


    }
