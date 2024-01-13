package com.example.tinkovquotes.presentation.util

import androidx.media3.common.MediaItem
import androidx.media3.common.util.UnstableApi
import androidx.media3.datasource.RawResourceDataSource
import com.example.tinkovquotes.R

@UnstableApi
object MediaItemMatcher {

    fun getMediaItemById(quoteId: Int): MediaItem {
        val videoRes = when (quoteId) {
            1 -> R.raw.video_1
            2 -> R.raw.video_2
            3 -> R.raw.video_3
            4 -> R.raw.video_4
            5 -> R.raw.video_5
            6 -> R.raw.video_6
            7 -> R.raw.video_7
            8 -> R.raw.video_8
            9 -> R.raw.video_9
            10 -> R.raw.video_10
            11 -> R.raw.video_11
            12 -> R.raw.video_12
            13 -> R.raw.video_13
            14 -> R.raw.video_14
            15 -> R.raw.video_15
            16 -> R.raw.video_16
            17 -> R.raw.video_17
            18 -> R.raw.video_18
            19 -> R.raw.video_19
            20 -> R.raw.video_20
            else -> R.raw.video_1
        }

        val uriRes = RawResourceDataSource.buildRawResourceUri(videoRes)
        return MediaItem.fromUri(uriRes)
    }
}