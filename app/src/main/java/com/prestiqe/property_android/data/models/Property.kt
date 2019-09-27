package com.prestiqe.property_android.data.models

import com.google.gson.annotations.SerializedName

data class Property(
    @SerializedName("property_id")
    val id: String,
    @SerializedName("street_number")
    val streetNumber: String,
    @SerializedName("street")
    val street: String,
    @SerializedName("street_suffix")
    val streetSuffix: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("state")
    val state: String,
    @SerializedName("zip")
    val zip: String,
    @SerializedName("bedrooms")
    val bedrooms: Double,
    @SerializedName("bathrooms")
    val bathrooms: Double,
    @SerializedName("price")
    val price: String,
    @SerializedName("square_feet")
    val squareFeet: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("notes")
    val notes: String = "Please enter a note here...",
    @SerializedName("images")
    val images: ArrayList<Image>,
    @SerializedName("real_estate_type")
    val realEstateType: String,
    @SerializedName("property_type")
    val propertyType: String
)