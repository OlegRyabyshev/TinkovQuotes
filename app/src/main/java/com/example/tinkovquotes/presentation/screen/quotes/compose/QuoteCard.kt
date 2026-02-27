package com.example.tinkovquotes.presentation.screen.quotes.compose

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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
fun QuoteCard(
    quoteItem: QuoteItem,
    isPlaying: Boolean,
    onPlay: (Int) -> Unit,
    onStop: () -> Unit,
    onFavoriteChange: (Int, Boolean) -> Unit,
) {
    val controlWidth by animateDpAsState(
        targetValue = if (isPlaying) 44.dp else 0.dp,
        label = "CardWidthLabel"
    )

    Card(
        modifier = Modifier
            .height(92.dp)
            .clip(RoundedCornerShape(10.dp)),
        onClick = { onPlay.invoke(quoteItem.id) }
    ) {
        Row {
            Text(
                modifier = Modifier
                    .width(220.dp)
                    .padding(
                        horizontal = 12.dp,
                        vertical = 10.dp
                    ),
                text = quoteItem.title,
                maxLines = 4,
                overflow = TextOverflow.Ellipsis,
                style = Typography.titleMedium
            )


            AnimatedVisibility(
                visible = isPlaying,
                enter = fadeIn(),
                exit = fadeOut()
            ) {
                Column(
                    modifier = Modifier.width(controlWidth),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    QuoteCardLikeButton(
                        quoteItem = quoteItem,
                        onFavoriteChange = onFavoriteChange
                    )

                    QuoteStopButton(
                        onStop = onStop
                    )
                }
            }
        }
    }
}

@Composable
private fun QuoteCardLikeButton(
    quoteItem: QuoteItem,
    onFavoriteChange: (Int, Boolean) -> Unit
) {
    val favoriteIcon = if (quoteItem.isFavorite) {
        ImageVector.vectorResource(R.drawable.ic_favorite_filled_24dp)
    } else {
        ImageVector.vectorResource(R.drawable.ic_favorite_24dp)
    }

    IconButton(
        modifier = Modifier.fillMaxWidth(),
        onClick = { onFavoriteChange.invoke(quoteItem.id, !quoteItem.isFavorite) }
    ) {
        Icon(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxSize(),
            imageVector = favoriteIcon,
            contentDescription = null
        )
    }
}

@Composable
private fun QuoteStopButton(
    onStop: () -> Unit
) {
    IconButton(
        modifier = Modifier.fillMaxWidth(),
        onClick = onStop
    ) {
        Icon(
            modifier = Modifier.fillMaxSize(),
            imageVector = ImageVector.vectorResource(R.drawable.ic_stop_24dp),
            contentDescription = null
        )
    }
}

@Composable
@Preview
private fun QuoteCardPreview() {
    val quoteItem = QuoteItem(
        id = 1,
        title = "Ты совершил страшное преступление. Ты должен сидеть в тюрьме. Ты должен сидеть в тюрьме",
        topicType = TopicItemType.QUESTIONING,
        isFavorite = false
    )

    QuoteCard(
        quoteItem = quoteItem,
        isPlaying = true,
        onPlay = {},
        onStop = {},
        onFavoriteChange = { _, _ -> },
    )
}
