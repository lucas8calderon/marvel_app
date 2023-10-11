package com.example.marvel_app.model.character

import com.google.gson.annotations.SerializedName
import java.io.Serializable

//dados com os results e lista de caracteres
data class CharacterModelData(
    @SerializedName("results")
    val results: List<CharacterModel>
) : Serializable
