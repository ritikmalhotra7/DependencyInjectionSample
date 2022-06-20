package com.example.dependencyinjectionsample.data.repository

import android.app.Application
import android.util.Log
import com.example.dependencyinjectionsample.R
import com.example.dependencyinjectionsample.data.remote.MyAPi
import com.example.dependencyinjectionsample.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api:MyAPi,
    private val appContext:Application
):MyRepository {

    init{
        println("helllo from repo -")
        Log.d("tag","helllo from repo - ")
    }
    override suspend fun doNetworkCall() {
    }
}