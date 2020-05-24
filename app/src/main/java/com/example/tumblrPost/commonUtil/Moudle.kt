package com.example.tumblrPost.commonUtil

import com.example.tumblrPost.mainActivity.TumblrRepository
import com.example.tumblrPost.mainActivity.TumblrViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val myModule = module {
    viewModel { TumblrViewModel(get()) }
}

val repoModule = module {
    single { TumblrRepository() }
}