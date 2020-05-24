package com.example.tumblrPost.viewHolder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tumblrPost.commonUtil.StaticVariable.IMAGE_URL_PATH
import com.example.tumblrPost.commonUtil.setImageView
import com.example.tumblrPost.model.TumblrPostModel
import kotlinx.android.synthetic.main.adapter_header_item.view.*
import java.lang.StringBuilder

class TumblrHeaderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(mContext: Context, tumblrModel: TumblrPostModel?) {
        val titleText  = StringBuilder()
        titleText.append(tumblrModel?.tumblrBlogModel?.title)
        titleText.append("\n")
        titleText.append(tumblrModel?.tumblrBlogModel?.description)
        titleText.append("\n")
        titleText.append(tumblrModel?.tumblrBlogModel?.url)
        itemView.tvHeaderTitle.text = titleText

        tumblrModel?.tumblrBlogModel?.avatarList?.get(0)?.url?.let {
            setImageView(mContext, it, itemView.ivHeaderImage)
        } ?: setImageView(mContext, IMAGE_URL_PATH, itemView.ivHeaderImage)
    }
}