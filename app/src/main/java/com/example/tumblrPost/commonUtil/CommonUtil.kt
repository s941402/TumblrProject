package com.example.tumblrPost.commonUtil

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.tumblrPost.R
import com.example.tumblrPost.model.TumblrPostModel

fun setImageView(mContext: Context, url: String, imageView: AppCompatImageView) {
    GlideApp.with(mContext)
        .load(url)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .placeholder(R.drawable.ic_launcher_background)
        .into(imageView)
}

fun setTumblrText(tumblrModel: TumblrPostModel, tvItemData: AppCompatTextView) {
    val titleText = StringBuilder()
    titleText.append(tumblrModel.shortUrl)
    titleText.append("\n")
    titleText.append(tumblrModel.date)
    tvItemData.text = titleText
}

fun setTumblrImage(
    mContext: Context,
    tumblrModel: TumblrPostModel,
    ivItemImage: AppCompatImageView,
    ivItemPlayer: AppCompatImageView
) {
    ivItemPlayer.visibility =
        if (tumblrModel.type == "video") View.VISIBLE else View.GONE
    if (tumblrModel.type == "video") {
        setImageView(
            mContext,
            tumblrModel.thumbnailUrl ?: StaticVariable.IMAGE_URL_PATH,
            ivItemImage
        )
    } else if (tumblrModel.type == "photo") {
        tumblrModel.photos?.firstOrNull()?.let {
            setImageView(
                mContext,
                it.original_size?.url ?: StaticVariable.IMAGE_URL_PATH,
                ivItemImage
            )
        } ?: setImageView(mContext, StaticVariable.IMAGE_URL_PATH, ivItemImage)
    }
}

/***
 * 統一管理 Toast 訊息，以免發生 Toast 交疊狀況
 * @param mContext
 * @param msg
 * @param duration
 */
fun showToast(mContext: Context, msg: String) {
    Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show()
}

