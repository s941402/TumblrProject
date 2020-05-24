package com.example.tumblrPost.mainActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ*\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0002J*\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J*\u0010\u0016\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J*\u0010\u0017\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/tumblrPost/mainActivity/InfoDataSource;", "Landroidx/paging/PageKeyedDataSource;", "", "Lcom/example/tumblrPost/model/TumblrPostModel;", "blogIdentifier", "", "repository", "Lcom/example/tumblrPost/mainActivity/TumblrRepository;", "(Ljava/lang/String;Lcom/example/tumblrPost/mainActivity/TumblrRepository;)V", "retryQuery", "Lkotlin/Function0;", "", "executeQuery", "", "page", "callback", "Lkotlin/Function1;", "", "loadAfter", "params", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "refresh", "app_release"})
public final class InfoDataSource extends androidx.paging.PageKeyedDataSource<java.lang.Integer, com.example.tumblrPost.model.TumblrPostModel> {
    private kotlin.jvm.functions.Function0<? extends java.lang.Object> retryQuery;
    private final java.lang.String blogIdentifier = null;
    private final com.example.tumblrPost.mainActivity.TumblrRepository repository = null;
    
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, com.example.tumblrPost.model.TumblrPostModel> callback) {
    }
    
    @java.lang.Override()
    public void loadAfter(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.example.tumblrPost.model.TumblrPostModel> callback) {
    }
    
    @java.lang.Override()
    public void loadBefore(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.example.tumblrPost.model.TumblrPostModel> callback) {
    }
    
    private final void executeQuery(int page, kotlin.jvm.functions.Function1<? super java.util.List<com.example.tumblrPost.model.TumblrPostModel>, kotlin.Unit> callback) {
    }
    
    public final void refresh() {
    }
    
    public InfoDataSource(@org.jetbrains.annotations.NotNull()
    java.lang.String blogIdentifier, @org.jetbrains.annotations.NotNull()
    com.example.tumblrPost.mainActivity.TumblrRepository repository) {
        super();
    }
}