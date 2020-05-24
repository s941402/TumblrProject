package com.example.tumblrPost.mainActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/tumblrPost/mainActivity/TumblrInfoFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/example/tumblrPost/model/TumblrPostModel;", "tumblrRepository", "Lcom/example/tumblrPost/mainActivity/TumblrRepository;", "blogIdentifier", "", "(Lcom/example/tumblrPost/mainActivity/TumblrRepository;Ljava/lang/String;)V", "sourceLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/tumblrPost/mainActivity/InfoDataSource;", "create", "Landroidx/paging/DataSource;", "getSource", "updateQuery", "", "app_debug"})
public final class TumblrInfoFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, com.example.tumblrPost.model.TumblrPostModel> {
    private final androidx.lifecycle.MutableLiveData<com.example.tumblrPost.mainActivity.InfoDataSource> sourceLiveData = null;
    private com.example.tumblrPost.mainActivity.TumblrRepository tumblrRepository;
    private java.lang.String blogIdentifier;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, com.example.tumblrPost.model.TumblrPostModel> create() {
        return null;
    }
    
    private final com.example.tumblrPost.mainActivity.InfoDataSource getSource() {
        return null;
    }
    
    public final void updateQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String blogIdentifier) {
    }
    
    public TumblrInfoFactory(@org.jetbrains.annotations.NotNull()
    com.example.tumblrPost.mainActivity.TumblrRepository tumblrRepository, @org.jetbrains.annotations.NotNull()
    java.lang.String blogIdentifier) {
        super();
    }
}