package com.example.tinkovquotes.model.domain.quote

data class QuoteItem(
    val id: Int,
    val titleText: String,
    val subtitleText: String,
    val isFavorite: Boolean
)