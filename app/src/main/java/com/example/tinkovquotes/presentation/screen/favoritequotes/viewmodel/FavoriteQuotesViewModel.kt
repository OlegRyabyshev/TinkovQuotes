package com.example.tinkovquotes.presentation.screen.favoritequotes.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tinkovquotes.domain.interactor.QuotesInteractor
import com.example.tinkovquotes.model.domain.quote.QuoteItem
import kotlinx.coroutines.flow.MutableStateFlow

class FavoriteQuotesViewModel(
    private val quotesInteractor: QuotesInteractor
) : ViewModel() {

    private lateinit var fullQuoteList: List<QuoteItem>

    private val _searchTextStateFlow = MutableStateFlow("")
    val searchTextStateFlow = _searchTextStateFlow

    private val _quotesListStateFlow = MutableStateFlow<List<QuoteItem>>(emptyList())
    val quotesListStateFlow = _quotesListStateFlow

    init {
        updateFavoriteQuotesList()
    }

    fun onFavoriteChange(quoteId: Int, isFavorite: Boolean) {
        quotesInteractor.updateFavoriteState(quoteId, isFavorite)

        updateFavoriteQuotesList()
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
           quote.title.contains(other = searchText, ignoreCase = true)
        }
    }

    private fun updateFavoriteQuotesList() {
        fullQuoteList = quotesInteractor.getFavoriteQuotesList()

        _quotesListStateFlow.value = fullQuoteList
    }
}