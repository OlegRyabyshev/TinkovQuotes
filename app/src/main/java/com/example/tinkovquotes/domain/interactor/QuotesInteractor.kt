package com.example.tinkovquotes.domain.interactor

import com.example.tinkovquotes.model.domain.quote.QuoteItem

interface QuotesInteractor {

    fun getQuotesList(): List<QuoteItem>

    fun getFavoriteQuotesList(): List<QuoteItem>

    fun updateFavoriteState(quoteId: Int, isFavorite: Boolean)
}