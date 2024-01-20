package com.example.tinkovquotes.presentation.util

import android.annotation.SuppressLint
import android.content.Context
import androidx.media3.common.MediaItem
import androidx.media3.datasource.RawResourceDataSource
import com.example.tinkovquotes.R

@SuppressLint("UnsafeOptInUsageError")
object MediaItemMatcher {

    fun getMediaItemById(context: Context, quoteId: Int): MediaItem {
        val videoRes = getVideoResById(context, quoteId)

        val uriRes = RawResourceDataSource.buildRawResourceUri(videoRes)
        return MediaItem.fromUri(uriRes)
    }

    @SuppressLint("DiscouragedApi")
    fun getVideoResById(context: Context, quoteId: Int): Int {
        val videoRes = context.resources
            .getIdentifier("video_$quoteId", "raw", context.packageName)

        return if (videoRes == 0) {
            R.raw.video_1
        } else {
            videoRes
        }
    }
}