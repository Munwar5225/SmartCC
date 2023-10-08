package com.example.smartcc.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.smartcc.MainActivity
import com.example.smartcc.R

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signIn= findViewById<Button>(R.id.btnSignIn);
        val tv  = findViewById<TextView>(R.id.tvAlreadyAccount);

        signIn.setOnClickListener {
            val intent  = Intent(this@SignIn, MainActivity::class.java)
            startActivity(intent);
            finish()
        }
        tv.setOnClickListener {
            val intent  = Intent(this@SignIn, SignUp::class.java)
            startActivity(intent);
            finish()
        }
    }
}