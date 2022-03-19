package com.example.newsapp.model


import com.google.gson.annotations.SerializedName

data class NewsResponse(
    var status: String, // ok
    var totalResults: Int, // 2290
    var articles: List<Article>
)