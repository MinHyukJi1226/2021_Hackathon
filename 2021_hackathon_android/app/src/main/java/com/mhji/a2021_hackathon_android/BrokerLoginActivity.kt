package com.mhji.a2021_hackathon_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.mhji.a2021_hackathon_android.NetWork.RetrofitClient
import com.mhji.a2021_hackathon_android.NetWork.RetrofitService
import com.mhji.a2021_hackathon_android.NetWork.UserLogin
import com.mhji.a2021_hackathon_android.NetWork.brokerLogin
import com.mhji.a2021_hackathon_android.data.BrokerLoginBody
import com.mhji.a2021_hackathon_android.data.LoginBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class BrokerLoginActivity : AppCompatActivity() {

    lateinit var client : Retrofit
    lateinit var service : RetrofitService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broker_login)

        client = RetrofitClient.getInstance()
        service = RetrofitClient.getService(client)

        val BsignUp : TextView = findViewById(R.id.toBSignUp)
        val BloginBtn : Button = findViewById(R.id.Blogin_btn)

        val BloginEdittext = findViewById<EditText>(R.id.Blogin_id)
        val BpwEdittext = findViewById<EditText>(R.id.Blogin_pw)

        BsignUp.setOnClickListener {
            val intent : Intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)
        }

        BloginBtn.setOnClickListener {
            service.brokerLoginRequest(BrokerLoginBody(BloginEdittext.text.toString(), BpwEdittext.text.toString())).enqueue(object :
                Callback<brokerLogin> {
                override fun onResponse(call: Call<brokerLogin>, response: Response<brokerLogin>) {
//                    Log.d("LOG", "${response.code()}")
                    val intent : Intent = Intent(this@BrokerLoginActivity, BrokerMainActivity::class.java)
                    startActivity(intent)
                }

                override fun onFailure(call: Call<brokerLogin>, t: Throwable) {
                    Toast.makeText(this@BrokerLoginActivity, "연결 실패.....", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }
}