package com.example.tumblrPost.mainActivity

import android.util.Log
import androidx.paging.PageKeyedDataSource
import com.example.tumblrPost.config.Config.AUTHORIZATION
import com.example.tumblrPost.model.TumblrPostModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import retrofit2.HttpException

/*分頁式加載*/
class InfoDataSource(
    private val blogIdentifier: String,
    private val repository: TumblrRepository
) :
    PageKeyedDataSource<Int, TumblrPostModel>() {

    private var retryQuery: (() -> Any)? = null //保留最後一個查詢，以防失敗

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, TumblrPostModel>
    ) {
        retryQuery = { loadInitial(params, callback) }
        executeQuery(1) {
            callback.onResult(it, null, 2)
        }
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, TumblrPostModel>) {
        val page = params.key
        retryQuery = { loadAfter(params, callback) }
        executeQuery(page) {
            callback.onResult(it, page + 1)
        }
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, TumblrPostModel>) {
        //Not implemented
    }

    /*執行api，並將回傳資料做處理*/
    private fun executeQuery(page: Int, callback: (MutableList<TumblrPostModel>) -> Unit) {
        repository.loadInfo(blogIdentifier, AUTHORIZATION, page)
            .map { result ->
                val tumblrHeader =
                    TumblrPostModel(tumblrBlogModel = result.response?.tumblrBlogModel)
                if (tumblrHeader.tumblrBlogModel != null) {
                    result.response?.tumblrPostList?.add(0, tumblrHeader)
                }
                result.response?.tumblrPostList
            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : DisposableSingleObserver<MutableList<TumblrPostModel>>() {


                override fun onSuccess(response: MutableList<TumblrPostModel>) {
                    /*Api成功時回傳View*/
                    retryQuery = null
                    callback(response)
                }

                override fun onError(e: Throwable) {
                    // Error handle.
                    retryQuery = null
                }
            })
    }

    fun refresh() =
        this.invalidate()
}