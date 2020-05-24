package com.example.tumblrPost.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class OriginalPhotoSizeModel(

    @SerializedName("url")
	@Expose
	val url: String?,

    @SerializedName("width")
	@Expose
	val width: Int?,

    @SerializedName("height")
	@Expose
	val height: Int?
) : Serializable