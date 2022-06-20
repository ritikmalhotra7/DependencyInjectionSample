package com.example.dependencyinjectionsample.data.di

import com.example.dependencyinjectionsample.data.repository.MyRepositoryImpl
import com.example.dependencyinjectionsample.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule{

    //@Binds is used whenever we have in depth constructor for implementation of repository
    // here we dont have to pass the repo as parameters else we have directly injected
    // that to constructor of RepoImpl
    //else we use provides and there we cannt use abstarct function
    // we have to return something in order to have some implementation
    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepoImpl:MyRepositoryImpl
    ):MyRepository
}