package com.example.tinkovquotes.domain.interactor

import com.example.tinkovquotes.domain.repository.QuotesRepository
import com.example.tinkovquotes.model.domain.quote.QuoteItem
import com.example.tinkovquotes.model.domain.quote.QuoteItem.TopicItemType

class QuotesInteractorImpl(
    private val quotesRepository: QuotesRepository
) : QuotesInteractor {

    override fun getQuotesList(): List<QuoteItem> {
        val quotesList = quotesRepository.getQuotesList()
        val favoriteQuotesIdList = quotesRepository.getFavoriteQuotesIdList()

        return quotesList.map { quote ->
            QuoteItem(
                id = quote.id,
                title = quote.titleText,
                topicType = TopicItemType.entries
                    .find { it.name.equals(quote.topicType.name, ignoreCase = true) }
                    ?: TopicItemType.NOT_SURE,
                isFavorite = favoriteQuotesIdList.contains(quote.id)
            )
        }
    }

    override fun getFavoriteQuotesList(): List<QuoteItem> =
        getQuotesList().filter { it.isFavorite }

    override fun updateFavoriteState(quoteId: Int, isFavorite: Boolean) {
        quotesRepository.updateFavoriteState(quoteId, isFavorite)
    }
}