package com.example.tumblrPost.mainActivity

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.example.tumblrPost.config.Config.DEFAULTBLOG
import com.example.tumblrPost.model.TumblrPostModel

class TumblrInfoFactory(
    private var tumblrRepository: TumblrRepository,
    private var blogIdentifier: String = DEFAULTBLOG
) : DataSource.Factory<Int, TumblrPostModel>() {

    private val sourceLiveData = MutableLiveData<InfoDataSource>()

    /*初始化DataSource*/
    override fun create(): DataSource<Int, TumblrPostModel> {
        val source = InfoDataSource(blogIdentifier, tumblrRepository)
        this.sourceLiveData.postValue(source)
        return source
    }

    private fun getSource() = sourceLiveData.value


    fun updateQuery(blogIdentifier: String) {
        this.blogIdentifier = blogIdentifier
        getSource()?.refresh()
    }
}