package com.firstproject.gopatrol.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.*
import android.os.Bundle
import com.firstproject.gopatrol.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@SplashScreenActivity, LoginActivity::class.java )
            startActivity(intent)
            finish()
        },1500)
    }
}