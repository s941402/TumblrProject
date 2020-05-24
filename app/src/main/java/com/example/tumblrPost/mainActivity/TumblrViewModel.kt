package com.example.tumblrPost.mainActivity

import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import com.example.tumblrPost.config.pagedListConfig

class TumblrViewModel(tumblrRepository: TumblrRepository) : ViewModel() {

    private val tumblrInfoSource = TumblrInfoFactory(tumblrRepository)

    val tumblrLiveData = LivePagedListBuilder(tumblrInfoSource, pagedListConfig()).build()

    fun searchTumblrInfo(query: String) {
        val search = query.trim()
        tumblrInfoSource.updateQuery(search)
    }
}