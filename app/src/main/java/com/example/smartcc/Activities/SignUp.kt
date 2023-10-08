package com.example.smartcc.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.smartcc.MainActivity
import com.example.smartcc.R

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val signUp= findViewById<Button>(R.id.btnSignUp);
        val tv  = findViewById<TextView>(R.id.tvAlreadyAccount);

        signUp.setOnClickListener {
            val intent  = Intent(this@SignUp, MainActivity::class.java)
            startActivity(intent);
            finish()
        }
        tv.setOnClickListener {
            val intent  = Intent(this@SignUp, SignIn::class.java)
            startActivity(intent);
            finish()
        }
    }
}