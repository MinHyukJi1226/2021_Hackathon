package com.mhji.a2021_hackathon_android.data

data class PostAllBody(
    val city: String,
    val county: String,
    val aptname: String,
    val type: String,
    val price: Int,
    val context : String,
    val attachment : String
)
