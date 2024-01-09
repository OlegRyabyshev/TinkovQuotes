package com.example.tinkovquotes.data.provider

import com.example.tinkovquotes.model.data.quote.QuoteDataModel

interface QuotesProvider {

    fun getQuotesList(): List<QuoteDataModel>
}