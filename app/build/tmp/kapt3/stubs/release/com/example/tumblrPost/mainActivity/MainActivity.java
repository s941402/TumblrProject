package com.example.tumblrPost.mainActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/tumblrPost/mainActivity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/tumblrPost/viewInterface/TumblrItemClickListener;", "()V", "tumblrViewModel", "Lcom/example/tumblrPost/mainActivity/TumblrViewModel;", "getTumblrViewModel", "()Lcom/example/tumblrPost/mainActivity/TumblrViewModel;", "tumblrViewModel$delegate", "Lkotlin/Lazy;", "userInfoAdapter", "Lcom/example/tumblrPost/adapter/TumblrDataAdapter;", "initView", "", "observeViewModelData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onItemClicked", "tumblrPostModel", "Lcom/example/tumblrPost/model/TumblrPostModel;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "app_release"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.tumblrPost.viewInterface.TumblrItemClickListener {
    private final kotlin.Lazy tumblrViewModel$delegate = null;
    private final com.example.tumblrPost.adapter.TumblrDataAdapter userInfoAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.tumblrPost.mainActivity.TumblrViewModel getTumblrViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void initView() {
    }
    
    private final void observeViewModelData() {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.Nullable()
    com.example.tumblrPost.model.TumblrPostModel tumblrPostModel) {
    }
    
    public MainActivity() {
        super();
    }
}