package com.example.tinkovquotes.presentation.screen.quotes.compose

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.tinkovquotes.R
import com.example.tinkovquotes.model.domain.quote.QuoteItem.TopicItemType
import com.example.tinkovquotes.presentation.common.search.QuoteSearch
import com.example.tinkovquotes.presentation.screen.quotes.viewmodel.QuotesSharedPlayerViewModel
import com.example.tinkovquotes.presentation.screen.quotes.viewmodel.QuotesViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun QuotesScreen() {
    val viewModel = koinViewModel<QuotesViewModel>()
    val playerViewModel = koinViewModel<QuotesSharedPlayerViewModel>()

    val searchText by viewModel.searchTextStateFlow.collectAsStateWithLifecycle()
    val quoteList by viewModel.quotesListStateFlow.collectAsStateWithLifecycle()

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
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(top = 10.dp, bottom = 16.dp)
        ) {

            val associatedQuoteList = quoteList
                .groupBy { it.topicType }
                .toList()
                .sortedBy { it.first.ordinal }

            items(
                items = associatedQuoteList,
                key = { pair -> pair.first }
            ) { pair ->
                val sectionTitleRes = when (pair.first) {
                    TopicItemType.HAPPY -> R.string.topic_type_happy
                    TopicItemType.LIKING -> R.string.topic_type_like
                    TopicItemType.SAD -> R.string.topic_type_sad
                    TopicItemType.ANNOYED -> R.string.topic_type_annoyed
                    TopicItemType.BASED -> R.string.topic_type_based
                    TopicItemType.RICH -> R.string.topic_type_rich
                    TopicItemType.DREAMING -> R.string.topic_type_dreaming
                    TopicItemType.THINKING -> R.string.topic_type_thinking
                    TopicItemType.SARCASTIC -> R.string.topic_type_sarcastic
                    TopicItemType.QUESTIONING -> R.string.topic_type_questioning
                    TopicItemType.NOT_CARING -> R.string.topic_type_not_caring
                    TopicItemType.NOT_SURE -> R.string.topic_type_not_sure
                }

                QuotesSection(
                    title = stringResource(sectionTitleRes),
                    quotesList = pair.second,
                    onClick = playerViewModel::playQuote,
                    onFavoriteChange = viewModel::onFavoriteChange
                )
            }
        }
    }
}
