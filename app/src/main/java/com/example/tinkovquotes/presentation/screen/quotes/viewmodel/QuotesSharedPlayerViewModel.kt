package com.example.tinkovquotes.presentation.screen.quotes.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tinkovquotes.presentation.player.sound.QuotesSoundPlayer
import kotlinx.coroutines.flow.MutableStateFlow

class QuotesSharedPlayerViewModel(
    private val quotesSoundPlayer: QuotesSoundPlayer
) : ViewModel() {

    private val _currentlyPlayingQuote = MutableStateFlow<Int?>(null)
    val currentlyPlayingQuoteId = _currentlyPlayingQuote

    fun playQuote(quoteId: Int) {
        quotesSoundPlayer.playQuote(quoteId)

        currentlyPlayingQuoteId.value = quoteId
    }
}