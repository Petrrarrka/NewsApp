package com.example.newsapp.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Source(
    var id: String?, // null
    var name: String // Lifehacker.com
): Parcelable