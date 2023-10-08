package com.example.smartcc.Activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.smartcc.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val loc: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(2500)
                } catch (e: Exception) {
                    e.printStackTrace()
                } finally {
                    val intent = Intent(this@SplashScreen, SignUp::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
        loc.start()
    }
}