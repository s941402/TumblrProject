package com.example.tumblrPost.mainActivity

import com.example.tumblrPost.apiService.ApiService
import com.example.tumblrPost.apiService.AppClientManager
import com.example.tumblrPost.model.HttpResult
import io.reactivex.Single


class TumblrRepository {
    private val apiService = AppClientManager.client.create(ApiService::class.java)

    /*執行Restful api*/
    fun loadInfo(blogIdentifier: String,apiKey: String,page: Int): Single<HttpResult> {
        return apiService.getTumblrPosts(blogIdentifier,apiKey,page)
    }

}