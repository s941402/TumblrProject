package com.example.tumblrPost.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ReponseStatusModel(
    @SerializedName("status")
    @Expose
    var status: Int? = null,

    @SerializedName("msg")
    @Expose
    var msg: String? = null
) : Serializable