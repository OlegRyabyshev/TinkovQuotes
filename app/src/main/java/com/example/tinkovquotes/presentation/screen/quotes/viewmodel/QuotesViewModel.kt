package com.example.tinkovquotes.presentation.screen.quotes.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tinkovquotes.domain.interactor.QuotesInteractor
import com.example.tinkovquotes.model.domain.quote.QuoteItem
import kotlinx.coroutines.flow.MutableStateFlow

class QuotesViewModel(
    private val quotesInteractor: QuotesInteractor
) : ViewModel() {

    private lateinit var fullQuoteList: List<QuoteItem>

    private val _searchTextStateFlow = MutableStateFlow("")
    val searchTextStateFlow = _searchTextStateFlow

    private val _quotesListStateFlow = MutableStateFlow<List<QuoteItem>>(emptyList())
    val quotesListStateFlow = _quotesListStateFlow

    init {
        updateQuotesList()
    }

    fun onFavoriteChange(quoteId: Int, isFavorite: Boolean) {
        quotesInteractor.updateFavoriteState(quoteId, isFavorite)

        updateQuotesList()
    }

    fun onSearchTextChange(searchText: String) {
        if (searchText == _searchTextStateFlow.value) {
            return
        }

        _searchTextStateFlow.value = searchText

        if (searchText.isBlank()) {
            _quotesListStateFlow.value = fullQuoteList
            return
        }

        _quotesListStateFlow.value = fullQuoteList.filter { quote ->
            val containsInTitle = quote.titleText.contains(
                other = searchText,
                ignoreCase = true
            )

            val containsInSubtitle = quote.subtitleText.contains(
                other = searchText,
                ignoreCase = true
            )

            containsInTitle || containsInSubtitle
        }
    }

    private fun updateQuotesList() {
        fullQuoteList = quotesInteractor.getQuotesList()

        _quotesListStateFlow.value = fullQuoteList
    }
}