package com.example.tumblrPost.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TumblrPhotosModel (
	@SerializedName("original_size")
	@Expose
	val original_size : OriginalPhotoSizeModel?
) : Serializable