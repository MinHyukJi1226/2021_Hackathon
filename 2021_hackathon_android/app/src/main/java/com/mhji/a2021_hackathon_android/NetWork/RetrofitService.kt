package com.mhji.a2021_hackathon_android.NetWork

import com.mhji.a2021_hackathon_android.data.BrokerLoginBody
import com.mhji.a2021_hackathon_android.data.BrokerSignUpBody
import com.mhji.a2021_hackathon_android.data.LoginBody
import com.mhji.a2021_hackathon_android.data.UserSignUpBody
import retrofit2.Call
import retrofit2.http.*

interface RetrofitService {

    //@FormUrlEncoded
    @POST("user/login")
    fun userLoginRequest(
        @Body loginBody: LoginBody
    ): Call<UserLogin>

    @FormUrlEncoded
    @POST("broker/login")
    fun brokerLoginRequest(
        @Body brokerLoginBody: BrokerLoginBody
    ) : Call<brokerLogin>

    @FormUrlEncoded
    @POST("user/signup")
    fun userSignUpRequest(
        @Body userSignUpBody: UserSignUpBody
    ) : Call<userSignUp>

    @FormUrlEncoded
    @POST("broker/signup")
    fun brokerSignUp(
        @Body brokerSignUpBody: BrokerSignUpBody
    ) : Call<brokerSignUp>
}