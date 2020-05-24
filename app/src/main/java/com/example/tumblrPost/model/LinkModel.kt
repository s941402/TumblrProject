package com.example.tumblrPost.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class LinkModel (
    @SerializedName("next")
    @Expose
    val nextPaging: PaginationModel?
): Serializable