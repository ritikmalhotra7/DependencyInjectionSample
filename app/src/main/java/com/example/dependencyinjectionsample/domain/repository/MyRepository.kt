package com.example.dependencyinjectionsample.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}