package com.example.tinkovquotes.model.presentation.screen.quotes

data class QuoteItem(
    val id: Int,
    val titleText: String,
    val subtitleText: String,
    val isFavorite: Boolean,
    val isPlaying: Boolean
)