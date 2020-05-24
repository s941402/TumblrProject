package com.example.tumblrPost.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class TumblrPostModel (

    @SerializedName("type")
    @Expose
    val type : String? = null,

    @SerializedName("blog_name")
    @Expose
    val blogName : String? = null,

    @SerializedName("blog")
    @Expose
    val tumblrBlogModel : TumblrBlogModel?,

    @SerializedName("post_url")
    @Expose
    val post_url : String? = null,

    @SerializedName("date")
    @Expose
    val date : String? = null,

    @SerializedName("state")
    @Expose
    val state : String? = null,

    @SerializedName("short_url")
    @Expose
    val shortUrl : String? = null,

    @SerializedName("note_count")
    @Expose
    val noteCount : Int? = null,

    @SerializedName("image_permalink")
    @Expose
    val imagePermalink : String? = null,

    @SerializedName("thumbnail_url")
    @Expose
    val thumbnailUrl : String? = null,

    @SerializedName("video_url")
    @Expose
    val videoUrl : String? = null,

    @SerializedName("photos")
    @Expose
    val photos : MutableList<TumblrPhotosModel>? = null

) : Serializable