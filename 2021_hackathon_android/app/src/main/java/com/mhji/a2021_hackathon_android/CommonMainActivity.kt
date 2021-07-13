package com.mhji.a2021_hackathon_android

import android.app.TaskStackBuilder.create
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mhji.a2021_hackathon_android.Adapter.UserRecyclerAdapter
import com.mhji.a2021_hackathon_android.Network.PostAll
import com.mhji.a2021_hackathon_android.Network.RetrofitClient
import com.mhji.a2021_hackathon_android.Network.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import java.net.URI.create

class CommonMainActivity : AppCompatActivity() {

    var dataList: PostAll? = null

    lateinit var userRecyclerAdapter : UserRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common_main)

        val retrofitService = Retrofit.Builder(RetrofitService::class.java)
        retrofitService.requestAllData().enqueue(object : Callback<PostAll> {
            override fun onResponse(call: Call<PostAll>, response: Response<PostAll>) {
                if (response.isSuccessful) {
                    val body = response.body()
                    body?.let {
                        //text_text.text = body.toString response 잘 받아왔는지 확인.

                        setAdapter(it.photos)
                    }
                }
            }

            override fun onFailure(call: Call<PostAll>, t: Throwable) {
                t.message?.let { Log.d("this is error", it) }
            }
        })
    }
}