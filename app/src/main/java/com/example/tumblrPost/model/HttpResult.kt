package com.example.tumblrPost.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class HttpResult(
    @SerializedName("meta")
    @Expose
    val meta: ReponseStatusModel?,

    @SerializedName("response")
    @Expose
    val response: TumblrResponseModel? = null,

    @SerializedName("total_posts")
    @Expose
    val totalPosts: Int?,

    @SerializedName("_links")
    @Expose
    val links: LinkModel?

) : Serializable