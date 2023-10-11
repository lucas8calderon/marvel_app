package com.example.marvel_app.model.comic

import com.example.marvel_app.model.ThumbnailModel
import com.google.gson.annotations.SerializedName
import java.io.Serializable

//responsavel por pegar id, titulo, descrição, thumnail.

data class ComicModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("thumbnail")
    val thumbnailModel: ThumbnailModel
) : Serializable
