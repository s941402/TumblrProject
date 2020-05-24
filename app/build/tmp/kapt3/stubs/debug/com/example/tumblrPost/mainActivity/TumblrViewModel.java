package com.example.tumblrPost.mainActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R;\u0010\u0007\u001a,\u0012(\u0012&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/example/tumblrPost/mainActivity/TumblrViewModel;", "Landroidx/lifecycle/ViewModel;", "tumblrRepository", "Lcom/example/tumblrPost/mainActivity/TumblrRepository;", "(Lcom/example/tumblrPost/mainActivity/TumblrRepository;)V", "tumblrInfoSource", "Lcom/example/tumblrPost/mainActivity/TumblrInfoFactory;", "tumblrLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/example/tumblrPost/model/TumblrPostModel;", "kotlin.jvm.PlatformType", "getTumblrLiveData", "()Landroidx/lifecycle/LiveData;", "searchTumblrInfo", "", "query", "", "app_debug"})
public final class TumblrViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.tumblrPost.mainActivity.TumblrInfoFactory tumblrInfoSource = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.example.tumblrPost.model.TumblrPostModel>> tumblrLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.example.tumblrPost.model.TumblrPostModel>> getTumblrLiveData() {
        return null;
    }
    
    public final void searchTumblrInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public TumblrViewModel(@org.jetbrains.annotations.NotNull()
    com.example.tumblrPost.mainActivity.TumblrRepository tumblrRepository) {
        super();
    }
}