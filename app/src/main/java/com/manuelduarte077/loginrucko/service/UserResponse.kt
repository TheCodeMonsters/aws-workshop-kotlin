package com.manuelduarte077.loginrucko.service

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var users: List<String>
)
