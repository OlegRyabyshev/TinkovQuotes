package com.example.tinkovquotes.presentation.player.sound

import android.content.Context
import androidx.media3.exoplayer.ExoPlayer
import com.example.tinkovquotes.presentation.util.MediaItemMatcher

class QuotesSoundPlayer(
    private val applicationContext: Context,
    private val exoPlayer: ExoPlayer
) {

    fun playQuote(quoteId: Int) {
        val mediaItem = MediaItemMatcher.getMediaItemById(
            context = applicationContext,
            quoteId = quoteId
        )

        exoPlayer.setMediaItem(mediaItem)
        exoPlayer.prepare()
        exoPlayer.play()
    }
}