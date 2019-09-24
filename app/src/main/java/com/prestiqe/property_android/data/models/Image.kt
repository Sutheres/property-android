package com.prestiqe.property_android.data.models

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String
)