package com.example.tumblrPost.commonUtil;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a&\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u0016\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0016\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005\u00a8\u0006\u0012"}, d2 = {"setImageView", "", "mContext", "Landroid/content/Context;", "url", "", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "setTumblrImage", "tumblrModel", "Lcom/example/tumblrPost/model/TumblrPostModel;", "ivItemImage", "ivItemPlayer", "setTumblrText", "tvItemData", "Landroidx/appcompat/widget/AppCompatTextView;", "showToast", "msg", "app_release"})
public final class CommonUtilKt {
    
    public static final void setImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView imageView) {
    }
    
    public static final void setTumblrText(@org.jetbrains.annotations.NotNull()
    com.example.tumblrPost.model.TumblrPostModel tumblrModel, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView tvItemData) {
    }
    
    public static final void setTumblrImage(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.example.tumblrPost.model.TumblrPostModel tumblrModel, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView ivItemImage, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView ivItemPlayer) {
    }
    
    /**
     * *
     * 統一管理 Toast 訊息，以免發生 Toast 交疊狀況
     * @param mContext
     * @param msg
     * @param duration
     */
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
}