package com.mhji.a2021_hackathon_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signUp : TextView = findViewById(R.id.toSignUp)
        val loginBtn : Button = findViewById(R.id.login_btn)

        signUp.setOnClickListener {
            val intent : Intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)
        }

        loginBtn.setOnClickListener {

        }
    }
}