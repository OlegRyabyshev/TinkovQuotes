package com.example.tinkovquotes.presentation.screen.favoritequotes.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.media3.exoplayer.ExoPlayer
import com.example.tinkovquotes.presentation.screen.favoritequotes.viewmodel.FavoriteQuotesViewModel
import com.example.tinkovquotes.presentation.screen.quotes.compose.QuoteCard
import com.example.tinkovquotes.presentation.util.MediaItemMatcher
import org.koin.androidx.compose.koinViewModel

@Composable
fun FavoriteQuotesScreen() {
    val favoriteQuotesViewModel = koinViewModel<FavoriteQuotesViewModel>()
    val favoriteQuoteList by favoriteQuotesViewModel.quotesListStateFlow.collectAsStateWithLifecycle()

    val context = LocalContext.current
    val exoPlayer = remember { ExoPlayer.Builder(context).build() }

    LaunchedEffect(Unit) {
        favoriteQuotesViewModel.updateFavoriteQuotesList()
    }

    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(
                start = 16.dp,
                end = 16.dp,
                top = 32.dp,
                bottom = 16.dp
            )
        ) {
            items(
                items = favoriteQuoteList,
                key = { quoteItem -> quoteItem.id }
            ) { quoteItem ->
                QuoteCard(
                    quoteItem = quoteItem,
                    onClick = { quoteId ->
                        val mediaItem = MediaItemMatcher.getMediaItemById(quoteId)

                        exoPlayer.setMediaItem(mediaItem)
                        exoPlayer.prepare()
                        exoPlayer.play()
                    },
                    onFavoriteChange = favoriteQuotesViewModel::onFavoriteChange
                )
            }
        }
    }
}