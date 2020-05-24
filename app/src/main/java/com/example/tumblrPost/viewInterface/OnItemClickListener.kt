package com.example.tumblrPost.viewInterface

import com.example.tumblrPost.model.TumblrPostModel

interface TumblrItemClickListener {
    fun onItemClicked(tumblrPostModel: TumblrPostModel?)
}