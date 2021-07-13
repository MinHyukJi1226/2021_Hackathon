package com.mhji.a2021_hackathon_android.NetWork

import retrofit2.Call
import retrofit2.http.*

interface RetrofitService {

    @FormUrlEncoded
    @POST("user/login")
    fun userLoginRequest(
        @Body() id : String,
        @Body() pw : String
    ): Call<userLogin>

    @FormUrlEncoded
    @POST("broker/login")
    fun brokerLoginRequest(
        @Body() id: String,
        @Body() pw : String
    ) : Call<brokerLogin>

    @FormUrlEncoded
    @POST("user/signup")
    fun userSignUpRequest(
        @Body() id: String,
        @Body() pw : String,
        @Body() phoneNumber : String
    ) : Call<userSignUp>

    @FormUrlEncoded
    @POST("broker/signup")
    fun brokerSignUp(
        @Body() id: String,
        @Body() pw : String,
        @Body() phoneNumber : String,
        @Body() city : String,
        @Body() county : String,
        @Body() name : String,
    ) : Call<brokerSignUp>
}