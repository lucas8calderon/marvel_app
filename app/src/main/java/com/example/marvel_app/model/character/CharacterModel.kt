package com.example.marvel_app.model.character

import com.example.marvel_app.model.ThumbnailModel
import com.google.gson.annotations.SerializedName


//primeiros objetos que vem da chamada:
//https://gateway.marvel.com:443/v1/public/characters?apikey=6d809cd31c7df2aa7f6c6830ac91cdc3

data class CharacterModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("thumbnail")
    val thumbnail: ThumbnailModel

) : java.io.Serializable
