package com.example.tinkovquotes.presentation.screen.favoritequotes.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tinkovquotes.domain.interactor.QuotesInteractor
import com.example.tinkovquotes.model.domain.quote.QuoteDomainModel
import com.example.tinkovquotes.model.presentation.screen.quotes.QuoteItem
import kotlinx.coroutines.flow.MutableStateFlow

class FavoriteQuotesViewModel(
    private val quotesInteractor: QuotesInteractor
) : ViewModel() {

    private val _quotesListStateFlow = MutableStateFlow<List<QuoteItem>>(emptyList())
    val quotesListStateFlow = _quotesListStateFlow

    fun updateFavoriteQuotesList() {
        val quotesList = quotesInteractor.getFavoriteQuotesList()

        _quotesListStateFlow.value = convertToQuoteItemList(quotesList)
    }

    fun onFavoriteChange(quoteId: Int, isFavorite: Boolean) {
        quotesInteractor.updateFavoriteState(quoteId, isFavorite)

        updateFavoriteQuotesList()
    }

    private fun convertToQuoteItemList(quotesList: List<QuoteDomainModel>) =
        quotesList.map { quote ->
            QuoteItem(
                id = quote.id,
                titleText = quote.titleText,
                subtitleText = quote.subtitleText,
                isFavorite = quote.isFavorite,
                isPlaying = false
            )
        }
}