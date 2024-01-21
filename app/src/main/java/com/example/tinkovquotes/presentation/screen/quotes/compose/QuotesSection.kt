package com.example.tinkovquotes.presentation.screen.quotes.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tinkovquotes.model.domain.quote.QuoteItem
import com.example.tinkovquotes.model.domain.quote.QuoteItem.TopicItemType
import com.example.tinkovquotes.presentation.theme.Typography

@Composable
fun QuotesSection(
    title: String,
    quotesList: List<QuoteItem>,
    onClick: (Int) -> Unit,
    onFavoriteChange: (Int, Boolean) -> Unit
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = title,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = Typography.titleMedium
        )

        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(quotesList) { quoteItem ->
                QuoteCard(
                    quoteItem = quoteItem,
                    onClick = onClick,
                    onFavoriteChange = onFavoriteChange
                )
            }
        }
    }
}

@Preview
@Composable
fun QuotesSectionPreview() {
    val quoteItem = QuoteItem(
        id = 1,
        title = "Ты совершил страшное преступление. Ты должен сидеть в тюрьме. Ты должен сидеть в тюрьме",
        topicType = TopicItemType.QUESTIONING,
        isFavorite = false
    )

    QuotesSection(
        title = "О жизни",
        quotesList = listOf(quoteItem, quoteItem, quoteItem),
        onClick = {},
        onFavoriteChange = { _, _ -> }
    )
}