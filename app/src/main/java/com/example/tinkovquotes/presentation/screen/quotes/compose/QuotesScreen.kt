package com.example.tinkovquotes.presentation.screen.quotes.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.tinkovquotes.presentation.common.search.QuoteSearch
import com.example.tinkovquotes.presentation.screen.quotes.viewmodel.QuotesViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun QuotesScreen() {
    val quotesViewModel = koinViewModel<QuotesViewModel>()
    val quoteList by quotesViewModel.quotesListStateFlow.collectAsStateWithLifecycle()

    LaunchedEffect(Unit) {
        quotesViewModel.updateQuotesList()
    }

    Column(modifier = Modifier.fillMaxSize()) {
        QuoteSearch()

        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(
                start = 16.dp,
                end = 16.dp,
                top = 10.dp,
                bottom = 16.dp
            )
        ) {
            items(quoteList) { quoteItem ->
                QuoteCard(
                    quoteItem = quoteItem,
                    onClick = {}
                )
            }
        }
    }
}
