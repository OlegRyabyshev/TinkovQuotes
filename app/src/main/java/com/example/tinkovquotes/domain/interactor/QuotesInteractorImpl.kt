package com.example.tinkovquotes.domain.interactor

import com.example.tinkovquotes.domain.repository.QuotesRepository
import com.example.tinkovquotes.model.domain.quote.QuoteDomainModel

class QuotesInteractorImpl(
    private val quotesRepository: QuotesRepository
) : QuotesInteractor {

    override fun getQuotesList(): List<QuoteDomainModel> {
        val quotesList = quotesRepository.getQuotesList()
        val favoriteQuotesIdList = quotesRepository.getFavoriteQuotesIdList()

        return quotesList.map { quote ->
            QuoteDomainModel(
                id = quote.id,
                titleText = quote.titleText,
                subtitleText = quote.subtitleText,
                isFavorite = favoriteQuotesIdList.contains(quote.id)
            )
        }
    }

    override fun getFavoriteQuotesList(): List<QuoteDomainModel> =
        getQuotesList().filter { it.isFavorite }

    override fun updateFavoriteState(quoteId: Int, isFavorite: Boolean) {
        quotesRepository.updateFavoriteState(quoteId, isFavorite)
    }
}