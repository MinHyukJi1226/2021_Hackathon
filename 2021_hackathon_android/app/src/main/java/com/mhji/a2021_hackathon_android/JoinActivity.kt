package com.mhji.a2021_hackathon_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        val userSignUp : Button = findViewById(R.id.signup_user)
        val brokerSignUp : Button = findViewById(R.id.signup_broker)

        userSignUp.setOnClickListener {
            val intent : Intent = Intent(this, CommonJoinActivity::class.java)
            startActivity(intent)
        }

        brokerSignUp.setOnClickListener {
            val intent : Intent = Intent(this, BrokerJoinActivity::class.java)
            startActivity(intent)
        }
    }
}