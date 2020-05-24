package com.example.tumblrPost.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TumblrResponseModel(
    @SerializedName("blog")
    @Expose
    val tumblrBlogModel : TumblrBlogModel?,

    @SerializedName("posts")
    @Expose
    val tumblrPostList : MutableList<TumblrPostModel>?

) : Serializable
