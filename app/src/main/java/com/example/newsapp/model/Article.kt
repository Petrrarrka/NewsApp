package com.example.newsapp.model


import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Entity(
    tableName = "articles"
)
@Parcelize
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var source: Source?,
    var author: String?, // Jeff Somers
    var title: String?, // Everything You Need to Know About Stock Splits (and Reverse Stock Splits)
    var description: String?, // In the nearly 30 years since Amazon launched as a humble online bookstore, it has moved into just about every aspect of our lives. It’s now a retailer, a grocery store, a media streamer, a movie production company, a cloud computing company, a major employer,…
    var url: String, // https://lifehacker.com/everything-you-need-to-know-about-stock-splits-and-rev-1848661571
    var urlToImage: String?, // https://i.kinja-img.com/gawker-media/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/17db8919b8249baa2eed54071d5f01db.jpg
    var publishedAt: String?, // 2022-03-16T19:30:00Z
    var content: String? // In the nearly 30 years since Amazon launched as a humble online bookstore, it has moved into just about every aspect of our lives. Its now a retailer, a grocery store, a media streamer, a movie produ… [+4451 chars]
): Parcelable