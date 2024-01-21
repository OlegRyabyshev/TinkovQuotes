package com.example.tinkovquotes.presentation.screen.favoritequotes.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.tinkovquotes.presentation.common.search.QuoteSearch
import com.example.tinkovquotes.presentation.screen.favoritequotes.viewmodel.FavoriteQuotesViewModel
import com.example.tinkovquotes.presentation.screen.quotes.viewmodel.QuotesSharedPlayerViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun FavoriteQuotesScreen() {
    val viewModel = koinViewModel<FavoriteQuotesViewModel>()
    val playerViewModel = koinViewModel<QuotesSharedPlayerViewModel>()

    val searchText by viewModel.searchTextStateFlow.collectAsStateWithLifecycle()
    val favoriteQuoteList by viewModel.quotesListStateFlow.collectAsStateWithLifecycle()

    val currentlyPlayingQuoteId by playerViewModel.currentlyPlayingQuoteId.collectAsStateWithLifecycle()

    Column(modifier = Modifier.fillMaxSize()) {
        QuoteSearch(
            searchText = searchText,
            onTextChange = viewModel::onSearchTextChange
        )

        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(
                start = 16.dp,
                end = 16.dp,
                top = 10.dp,
                bottom = 16.dp
            )
        ) {
            items(
                items = favoriteQuoteList,
                key = { quoteItem -> quoteItem.id }
            ) { quoteItem ->
                FavoriteQuoteCard(
                    quoteItem = quoteItem,
                    isPlaying = quoteItem.id == currentlyPlayingQuoteId,
                    onClick = playerViewModel::playQuote,
                    onFavoriteChange = viewModel::onFavoriteChange
                )
            }
        }
    }
}