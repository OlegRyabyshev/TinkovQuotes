package com.example.tinkovquotes.data.provider

import com.example.tinkovquotes.model.data.quote.QuoteDataModel

class QuotesProviderImpl : QuotesProvider {

    override fun getQuotesList(): List<QuoteDataModel> =
        QUOTE_LIST

    private companion object {
        val QUOTE_LIST = listOf(
            QuoteDataModel(
                id = 1,
                titleText = "Блять",
                subtitleText = "Я заплакал"
            ),
            QuoteDataModel(
                id = 2,
                titleText = "Сомнительно",
                subtitleText = "Но окЭй"
            ),
            QuoteDataModel(
                id = 3,
                titleText = "Это было не просто смело",
                subtitleText = "Это было пиздец как смело"
            ),
        )
    }
}