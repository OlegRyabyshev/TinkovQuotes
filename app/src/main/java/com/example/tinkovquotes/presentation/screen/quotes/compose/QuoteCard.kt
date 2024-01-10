package com.example.tinkovquotes.presentation.screen.quotes.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tinkovquotes.model.presentation.screen.quotes.QuoteItem
import com.example.tinkovquotes.presentation.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuoteCard(
    quoteItem: QuoteItem,
    onClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(76.dp)
            .clip(RoundedCornerShape(16.dp)),
//        colors = CardDefaults.cardColors(contentColor = ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        onClick = {
            onClick.invoke(quoteItem.id)
        }
    ) {
        Box(modifier.fillMaxSize()) {
            Row(modifier.fillMaxSize()) {
                Column(
                    modifier = modifier.weight(1f)
                ) {
                    Text(
                        modifier = modifier.padding(
                            start = 12.dp,
                            top = 8.dp
                        ),
                        text = quoteItem.titleText,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        style = Typography.titleMedium
                    )
                    Text(
                        modifier = modifier.padding(
                            start = 12.dp,
                            top = 6.dp
                        ),
                        text = quoteItem.subtitleText,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        style = Typography.bodySmall
                    )
                }

                Icon(
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .size(36.dp)
                        .align(Alignment.CenterVertically),
                    imageVector = if (quoteItem.isPlaying) {
                        Icons.Filled.Favorite
                    } else {
                        Icons.Filled.FavoriteBorder
                    },
                    contentDescription = null
                )

                if (quoteItem.isPlaying) {
                    Icon(
                        modifier = Modifier
                            .padding(end = 12.dp)
                            .size(48.dp)
                            .align(Alignment.CenterVertically),
                        imageVector = if (quoteItem.isPlaying) {
                            Icons.Filled.PlayArrow
                        } else {
                            Icons.Default.PlayArrow
                        },
                        contentDescription = null
                    )
                }
            }

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


@Composable
@Preview
private fun QuoteCardPreview() {
    val quoteItem = QuoteItem(
        id = 1,
        titleText = "Ты совершил страшное преступление. Ты должен сидеть в тюрьме.",
        subtitleText = "Ты совершил страшное преступление. Ты должен сидеть в тюрьме.",
        isPlaying = true,
        isFavorite = true
    )

    QuoteCard(
        quoteItem = quoteItem,
        onClick = {}
    )
}