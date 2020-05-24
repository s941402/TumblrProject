package com.example.tumblrPost.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/example/tumblrPost/model/HttpResult;", "Ljava/io/Serializable;", "meta", "Lcom/example/tumblrPost/model/ReponseStatusModel;", "response", "Lcom/example/tumblrPost/model/TumblrResponseModel;", "totalPosts", "", "links", "Lcom/example/tumblrPost/model/LinkModel;", "(Lcom/example/tumblrPost/model/ReponseStatusModel;Lcom/example/tumblrPost/model/TumblrResponseModel;Ljava/lang/Integer;Lcom/example/tumblrPost/model/LinkModel;)V", "getLinks", "()Lcom/example/tumblrPost/model/LinkModel;", "getMeta", "()Lcom/example/tumblrPost/model/ReponseStatusModel;", "getResponse", "()Lcom/example/tumblrPost/model/TumblrResponseModel;", "getTotalPosts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Lcom/example/tumblrPost/model/ReponseStatusModel;Lcom/example/tumblrPost/model/TumblrResponseModel;Ljava/lang/Integer;Lcom/example/tumblrPost/model/LinkModel;)Lcom/example/tumblrPost/model/HttpResult;", "equals", "", "other", "", "hashCode", "toString", "", "app_release"})
public final class HttpResult implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "meta")
    private final com.example.tumblrPost.model.ReponseStatusModel meta = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "response")
    private final com.example.tumblrPost.model.TumblrResponseModel response = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total_posts")
    private final java.lang.Integer totalPosts = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "_links")
    private final com.example.tumblrPost.model.LinkModel links = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.tumblrPost.model.ReponseStatusModel getMeta() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.tumblrPost.model.TumblrResponseModel getResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalPosts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.tumblrPost.model.LinkModel getLinks() {
        return null;
    }
    
    public HttpResult(@org.jetbrains.annotations.Nullable()
    com.example.tumblrPost.model.ReponseStatusModel meta, @org.jetbrains.annotations.Nullable()
    com.example.tumblrPost.model.TumblrResponseModel response, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalPosts, @org.jetbrains.annotations.Nullable()
    com.example.tumblrPost.model.LinkModel links) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.tumblrPost.model.ReponseStatusModel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.tumblrPost.model.TumblrResponseModel component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.tumblrPost.model.LinkModel component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tumblrPost.model.HttpResult copy(@org.jetbrains.annotations.Nullable()
    com.example.tumblrPost.model.ReponseStatusModel meta, @org.jetbrains.annotations.Nullable()
    com.example.tumblrPost.model.TumblrResponseModel response, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalPosts, @org.jetbrains.annotations.Nullable()
    com.example.tumblrPost.model.LinkModel links) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}