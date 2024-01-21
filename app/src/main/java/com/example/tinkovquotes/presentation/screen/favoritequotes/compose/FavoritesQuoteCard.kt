package com.example.tinkovquotes.presentation.screen.favoritequotes.compose

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandIn
import androidx.compose.animation.shrinkOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tinkovquotes.R
import com.example.tinkovquotes.model.domain.quote.QuoteItem
import com.example.tinkovquotes.model.domain.quote.QuoteItem.TopicItemType
import com.example.tinkovquotes.presentation.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoriteQuoteCard(
    quoteItem: QuoteItem,
    isPlaying: Boolean,
    onClick: (Int) -> Unit,
    onFavoriteChange: (Int, Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(68.dp)
            .clip(RoundedCornerShape(20.dp)),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        onClick = {
            onClick.invoke(quoteItem.id)
        }
    ) {
        Box(
            modifier
                .fillMaxSize()
                .padding(end = 4.dp)
        ) {
            FavoriteQuoteCardContent(
                quoteItem = quoteItem,
                isPlaying = isPlaying,
                onFavoriteChange = onFavoriteChange
            )

            if (isPlaying) {
                LinearProgressIndicator(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter)
                        .padding(horizontal = 12.dp),
                    progress = 1f
                )
            }
        }
    }
}

@Composable
private fun FavoriteQuoteCardContent(
    quoteItem: QuoteItem,
    isPlaying: Boolean,
    onFavoriteChange: (Int, Boolean) -> Unit
) {
    Row(Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier
                .padding(start = 12.dp)
                .weight(1f)
                .align(Alignment.CenterVertically),
            text = quoteItem.title,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            style = Typography.titleMedium
        )

        val favoriteIcon = if (quoteItem.isFavorite) {
            ImageVector.vectorResource(R.drawable.ic_favorite_filled_24dp)
        } else {
            ImageVector.vectorResource(R.drawable.ic_favorite_24dp)
        }

        IconButton(
            modifier = Modifier
                .padding(start = 8.dp)
                .size(48.dp)
                .align(Alignment.CenterVertically),
            onClick = {
                onFavoriteChange.invoke(quoteItem.id, !quoteItem.isFavorite)
            }
        ) {
            Icon(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                imageVector = favoriteIcon,
                contentDescription = null
            )
        }

        AnimatedVisibility(
            modifier = Modifier
                .size(48.dp)
                .align(Alignment.CenterVertically),
            visible = isPlaying,
            enter = expandIn { it },
            exit = shrinkOut { it }
        ) {
            IconButton(
                modifier = Modifier.fillMaxSize(),
                onClick = {}
            ) {
                Icon(
                    modifier = Modifier.fillMaxSize(),
                    imageVector = ImageVector.vectorResource(R.drawable.ic_stop_24dp),
                    contentDescription = null
                )
            }
        }
    }
}


@Composable
@Preview
private fun FavoriteQuoteCardPreview() {
    val quoteItem = QuoteItem(
        id = 1,
        title = "Ты совершил страшное преступление. Ты должен сидеть в тюрьме",
        topicType = TopicItemType.QUESTIONING,
        isFavorite = true
    )

    FavoriteQuoteCard(
        quoteItem = quoteItem,
        isPlaying = true,
        onClick = {},
        onFavoriteChange = { _, _ -> }
    )
}