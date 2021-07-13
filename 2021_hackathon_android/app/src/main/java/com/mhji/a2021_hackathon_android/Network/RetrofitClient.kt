package com.mhji.a2021_hackathon_android.Network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private var instance: Retrofit? = null
    private val gson = GsonBuilder().setLenient().create()

    // 서버 주소
    private const val BASE_URL = "http://192.168.85.164:3000"

    fun getService(client: Retrofit): RetrofitService {
        return client.create(RetrofitService::class.java)
    }

    // SingleTon
    fun getInstance(): Retrofit {
        if (instance == null) {
            instance = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        }

        return instance!!
    }

}