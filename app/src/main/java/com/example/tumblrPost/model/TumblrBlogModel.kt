package com.example.tumblrPost.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TumblrBlogModel (

	@SerializedName("name")
	@Expose
	val name : String?,

	@SerializedName("title")
	@Expose
	val title : String?,

	@SerializedName("description")
	@Expose
	val description : String?,

	@SerializedName("url")
	@Expose
	val url : String?,

	@SerializedName("avatar")
	@Expose
	val avatarList : MutableList<OriginalPhotoSizeModel>?

) : Serializable