package com.mhji.a2021_hackathon_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mhji.a2021_hackathon_android.NetWork.RetrofitClient
import com.mhji.a2021_hackathon_android.NetWork.RetrofitService
import com.mhji.a2021_hackathon_android.NetWork.UserLogin
import com.mhji.a2021_hackathon_android.data.LoginBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class LoginActivity : AppCompatActivity() {

    lateinit var client : Retrofit
    lateinit var service : RetrofitService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        client = RetrofitClient.getInstance()
        service = RetrofitClient.getService(client)

        val signUp : TextView = findViewById(R.id.toSignUp)
        val loginBtn : Button = findViewById(R.id.login_btn)

        val loginEdittext = findViewById<EditText>(R.id.login_id)
        val pwEdittext = findViewById<EditText>(R.id.login_pw)

        signUp.setOnClickListener {
            val intent : Intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)
        }


        loginBtn.setOnClickListener {
            service.userLoginRequest(LoginBody(loginEdittext.text.toString(), pwEdittext.text.toString())).enqueue(object : Callback<UserLogin> {
                override fun onResponse(call: Call<UserLogin>, response: Response<UserLogin>) {
//                    Log.d("LOG", "${response.code()}")
                    val intent : Intent = Intent(this@LoginActivity, CommonMainActivity::class.java)
                    startActivity(intent)
                }

                override fun onFailure(call: Call<UserLogin>, t: Throwable) {

                }

            })
        }
    }
}