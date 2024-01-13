package com.example.tinkovquotes.data.repository

import com.example.tinkovquotes.data.provider.QuotesProvider
import com.example.tinkovquotes.data.sharedprefs.QuotesSharedPreference
import com.example.tinkovquotes.domain.repository.QuotesRepository
import com.example.tinkovquotes.model.data.quote.QuoteDataModel

class QuotesRepositoryImpl(
    private val quotesProvider: QuotesProvider,
    private val quotesSharedPreference: QuotesSharedPreference
) : QuotesRepository {

    override fun getQuotesList(): List<QuoteDataModel> =
        quotesProvider.getQuotesList()

    override fun getFavoriteQuotesIdList(): List<Int> =
        quotesSharedPreference.getFavoriteQuotesIdList()

    override fun updateFavoriteState(quoteId: Int, isFavorite: Boolean) {
        quotesSharedPreference.updateFavoriteState(quoteId, isFavorite)
    }
}