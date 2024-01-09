package com.example.tinkovquotes.data.repository

import com.example.tinkovquotes.data.provider.QuotesProvider
import com.example.tinkovquotes.domain.repository.QuotesRepository
import com.example.tinkovquotes.model.data.quote.QuoteDataModel

class QuotesRepositoryImpl(
    private val quotesProvider: QuotesProvider,
) : QuotesRepository {

    override fun getQuotesList(): List<QuoteDataModel> =
        quotesProvider.getQuotesList()

    override fun getFavoriteQuotesIdList(): List<Int> =
        listOf(1, 2)
}