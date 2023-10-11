package com.example.marvel_app.model.character

import com.google.gson.annotations.SerializedName
import java.io.Serializable


//resposta do servidor quando fazer a chamada, ele puxa o data que comtem o data que contem o caracter model e tem os results
data class CharacterModelResponse(
    @SerializedName("data")
    val data: CharacterModelData
) : Serializable
