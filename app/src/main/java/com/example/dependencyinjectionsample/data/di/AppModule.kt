package com.example.dependencyinjectionsample.data.di

import android.app.Application
import com.example.dependencyinjectionsample.MyApplication
import com.example.dependencyinjectionsample.data.remote.MyAPi
import com.example.dependencyinjectionsample.data.repository.MyRepositoryImpl
import com.example.dependencyinjectionsample.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi():MyAPi{
        return Retrofit.Builder().baseUrl("https.google.com").build().create(MyAPi::class.java)
    }

//    @Provides
//    @Singleton
//    fun provideMyRepository(api:MyAPi,app:Application): MyRepository {
//        return MyRepositoryImpl(api,app)
//    }

    //see RepositoryModule for more info.......

    @Provides
    @Singleton
    @Named("one")
    fun stringOne() = "One"

    @Provides
    @Singleton
    @Named("two")
    fun stringTwo() = "Two"


}