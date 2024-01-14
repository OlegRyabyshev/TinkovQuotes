package com.example.tinkovquotes.presentation.screen.quotes.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tinkovquotes.domain.interactor.QuotesInteractor
import com.example.tinkovquotes.model.domain.quote.QuoteItem
import kotlinx.coroutines.flow.MutableStateFlow

class QuotesViewModel(
    private val quotesInteractor: QuotesInteractor
) : ViewModel() {

    private val _quotesListStateFlow = MutableStateFlow<List<QuoteItem>>(emptyList())
    val quotesListStateFlow = _quotesListStateFlow

    fun updateQuotesList() {
        val quotesList = quotesInteractor.getQuotesList()

        _quotesListStateFlow.value = quotesList
    }

    fun onFavoriteChange(quoteId: Int, isFavorite: Boolean) {
        quotesInteractor.updateFavoriteState(quoteId, isFavorite)

        updateQuotesList()
    }
}