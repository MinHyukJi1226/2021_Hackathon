package com.mhji.a2021_hackathon_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_select)

        val userSignin : Button = findViewById(R.id.signin_user)
        val brokerSignUp : Button = findViewById(R.id.signin_broker)

        userSignin.setOnClickListener {
            val intent : Intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        brokerSignUp.setOnClickListener {
            val intent : Intent = Intent(this, BrokerLoginActivity::class.java)
            startActivity(intent)
        }
    }
}