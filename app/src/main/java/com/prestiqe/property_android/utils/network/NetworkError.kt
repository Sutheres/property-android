package com.prestiqe.property_android.utils.network


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NetworkError(
    val status: Int = -1,
    @Expose
    @SerializedName("statusCode")
    var statusCode: String = "-1",
    @Expose
    @SerializedName("messgae")
    var message: String = "Something went wrong"
)