package com.example.marvel_app.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    @GET("final url")
    fun setCharacter(@Path("character") character: String): Call<Character>
}