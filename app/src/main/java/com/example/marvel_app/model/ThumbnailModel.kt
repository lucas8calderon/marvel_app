package com.example.marvel_app.model

import com.google.gson.annotations.SerializedName

data class ThumbnailModel(
    @SerializedName("patch")
    val patch: String,
    @SerializedName("patch")
    val extension: String
)


//Serialized é utilizado quando serializa as propriedades,
// utilizado para quiando a propriedade e diferente do que vem do json