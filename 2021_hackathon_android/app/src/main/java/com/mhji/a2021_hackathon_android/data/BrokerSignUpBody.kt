package com.mhji.a2021_hackathon_android.data

data class BrokerSignUpBody(
    val id : String,
    val pw : String,
    val phoneNumber: String,
    val city : String,
    val county : String,
    val name : String
)
