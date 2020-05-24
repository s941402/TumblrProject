package com.example.tumblrPost.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.tumblrPost.R
import com.example.tumblrPost.model.TumblrPostModel
import com.example.tumblrPost.viewHolder.TumblrHeaderHolder
import com.example.tumblrPost.viewHolder.TumblrInfoItemHolder
import com.example.tumblrPost.viewInterface.TumblrItemClickListener

class TumblrDataAdapter(
    private val mContext: Context,
    private val itemClickListener: TumblrItemClickListener
) :
    PagedListAdapter<TumblrPostModel, RecyclerView.ViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        /*根據不同ViewType顯示不同介面*/
        return if (viewType == 0) {
            val tumblrHeaderView = inflater.inflate(R.layout.adapter_header_item, parent, false)
            TumblrHeaderHolder(tumblrHeaderView)
        } else {
            val tumblrDataView = inflater.inflate(R.layout.adapter_data_item, parent, false)
            TumblrInfoItemHolder(tumblrDataView)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val weatherInfoModel = getItem(position)
        when (holder) {
            /*初始化介面*/
            is TumblrHeaderHolder -> holder.bind(mContext, weatherInfoModel)
            is TumblrInfoItemHolder -> holder.bind(mContext, weatherInfoModel, itemClickListener)
            else -> throw IllegalArgumentException()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) 0 else 1
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<TumblrPostModel>() {
            override fun areItemsTheSame(
                oldItem: TumblrPostModel,
                newItem: TumblrPostModel
            ): Boolean =
                oldItem == newItem

            override fun areContentsTheSame(
                oldItem: TumblrPostModel,
                newItem: TumblrPostModel
            ): Boolean =
                oldItem == newItem
        }
    }
}