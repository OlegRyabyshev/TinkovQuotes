package com.example.tinkovquotes.domain.repository

import com.example.tinkovquotes.model.data.quote.QuoteDataModel

interface QuotesRepository {

    fun getQuotesList(): List<QuoteDataModel>

    fun getFavoriteQuotesIdList(): List<Int>

    fun updateFavoriteState(quoteId: Int, isFavorite: Boolean)
}