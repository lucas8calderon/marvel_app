package com.example.marvel_app.adapter

import com.example.marvel_app.api.Api
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitExtense {
    fun providerApi(build: Retrofit.Builder): Api {
        return build
            .build()
            .create(Api::class.java)
    }

    fun providerRetrofit(): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl("https://www.abibliadigital.com.br/")
            .addConverterFactory(GsonConverterFactory.create())
    }
}