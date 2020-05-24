package com.example.tumblrPost.apiService

import com.example.tumblrPost.model.HttpResult
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("v2/blog/{blog-identifier}/posts")
    fun getTumblrPosts(
        @Path("blog-identifier") blogIdentifier: String,
        @Query("api_key") apiKey: String,
        @Query("page_number") page: Int
    ): Single<HttpResult>
}
