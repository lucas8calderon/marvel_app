package com.example.marvel_app.model.comic

import com.google.gson.annotations.SerializedName

data class ComicModelResponse(
    @SerializedName("data")
    val data: ComicModelData
) : java.io.Serializable