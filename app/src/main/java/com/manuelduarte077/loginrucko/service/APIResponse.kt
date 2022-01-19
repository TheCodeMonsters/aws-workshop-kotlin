package com.manuelduarte077.loginrucko.service

import retrofit2.http.GET
import retrofit2.http.Url

interface APIResponse {
    @GET
    fun getUser(@Url url: String): Result<UserResponse>


}