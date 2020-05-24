package com.example.tumblrPost.viewHolder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tumblrPost.commonUtil.setTumblrImage
import com.example.tumblrPost.commonUtil.setTumblrText
import com.example.tumblrPost.model.TumblrPostModel
import com.example.tumblrPost.viewInterface.TumblrItemClickListener
import kotlinx.android.synthetic.main.adapter_data_item.view.*

class TumblrInfoItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(
        mContext: Context,
        tumblrModel: TumblrPostModel?,
        clickListener: TumblrItemClickListener
    ) {
        tumblrModel?.let {
            setTumblrText(it,itemView.tvItemData)
            setTumblrImage(mContext,it,itemView.ivItemImage,itemView.ivItemPlayerImage)
        }

        itemView.setOnClickListener {
            clickListener.onItemClicked(tumblrModel)
        }
    }
}