package com.example.dependencyinjectionsample.data.remote

import retrofit2.http.GET

interface MyAPi {
    @GET("test")
    suspend fun doNetworkCall()
}