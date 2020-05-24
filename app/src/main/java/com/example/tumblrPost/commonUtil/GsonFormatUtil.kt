package com.lavidatec.wacare.KotlinUtil

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

inline fun <reified T : Any> T.json(): String = Gson().toJson(this, T::class.java)
inline fun <reified T> Gson.fromJson(json: String): T = this.fromJson(json, object : TypeToken<T>() {}.type)