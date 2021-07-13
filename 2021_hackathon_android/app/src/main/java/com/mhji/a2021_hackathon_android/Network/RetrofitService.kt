package com.mhji.a2021_hackathon_android.Network

import com.mhji.a2021_hackathon_android.data.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RetrofitService {

    @POST("user/login")
    fun userLoginRequest(
        @Body loginBody: LoginBody
    ): Call<UserLogin>

    @POST("broker/login")
    fun brokerLoginRequest(
        @Body brokerLoginBody: BrokerLoginBody
    ) : Call<brokerLogin>

    @POST("user/signup")
    fun userSignUpRequest(
        @Body userSignUpBody: UserSignUpBody
    ) : Call<userSignUp>

    @POST("broker/signup")
    fun brokerSignUpRequest(
        @Body brokerSignUpBody: BrokerSignUpBody
    ) : Call<brokerSignUp>

    @POST("/post")
    fun postAll(
        @Body postAllBody: PostAllBody
    ) : Call<PostAll>
}