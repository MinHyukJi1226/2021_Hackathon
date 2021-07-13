package com.mhji.a2021_hackathon_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.mhji.a2021_hackathon_android.Network.RetrofitService
import com.mhji.a2021_hackathon_android.Network.userSignUp
import com.mhji.a2021_hackathon_android.data.UserSignUpBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class CommonJoinActivity : AppCompatActivity() {

    lateinit var client : Retrofit
    lateinit var service : RetrofitService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common_join)

        val SignUpId : EditText = findViewById(R.id.Cjoin_id_txt)
        val SignUpPw : EditText = findViewById(R.id.Cjoin_pw_txt)
        val SignUpPhone : EditText = findViewById(R.id.Cjoin_phone_txt)

        val signUpBtn : Button = findViewById(R.id.CJoin_Btn)



        signUpBtn.setOnClickListener {
            service.userSignUpRequest(UserSignUpBody(SignUpId.text.toString(), SignUpPw.text.toString(), SignUpPhone.text.toString())).enqueue(object :
                Callback<userSignUp> {
                override fun onResponse(call: Call<userSignUp>, response: Response<userSignUp>) {
//                    Log.d("LOG", "${response.code()}")
                    val intent : Intent = Intent(this@CommonJoinActivity, LoginActivity::class.java)
                    startActivity(intent)
                }

                override fun onFailure(call: Call<userSignUp>, t: Throwable) {
                    Toast.makeText(this@CommonJoinActivity, "연결 실패.....", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }


}