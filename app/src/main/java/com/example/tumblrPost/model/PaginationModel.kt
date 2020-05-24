package com.example.tumblrPost.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PaginationModel(
    @SerializedName("href")
    @Expose
    var paginationNextPath: String? = null
) : Serializable