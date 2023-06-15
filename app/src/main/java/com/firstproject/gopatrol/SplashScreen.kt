package com.firstproject.gopatrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.*
import android.os.Bundle

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, MainActivity::class.java )
            startActivity(intent)
            finish()
        },1500)
    }
}