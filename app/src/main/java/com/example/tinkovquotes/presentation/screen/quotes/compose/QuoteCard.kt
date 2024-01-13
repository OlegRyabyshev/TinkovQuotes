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
                .padding(end = 12.dp)
        ) {
            QuoteCardContent(quoteItem)

            if (quoteItem.isPlaying) {
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
private fun QuoteCardContent(quoteItem: QuoteItem) {
    Row(Modifier.fillMaxSize()) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                modifier = Modifier.padding(
                    start = 12.dp,
                    top = 10.dp
                ),
                text = quoteItem.titleText,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = Typography.titleMedium
            )
            Text(
                modifier = Modifier.padding(
                    start = 12.dp,
                    top = 6.dp
                ),
                text = quoteItem.subtitleText,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = Typography.bodySmall
            )
        }

        val favoriteIcon = if (quoteItem.isFavorite) {
            ImageVector.vectorResource(R.drawable.ic_favorite_filled_24dp)
        } else {
            ImageVector.vectorResource(R.drawable.ic_favorite_24dp)
        }

        IconButton(
            modifier = Modifier
                .padding(start = 8.dp)
                .size(54.dp)
                .align(Alignment.CenterVertically),
            onClick = {}
        ) {
            Icon(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                imageVector = favoriteIcon,
                contentDescription = null
            )
        }

        if (quoteItem.isPlaying) {
            IconButton(
                modifier = Modifier
                    .size(54.dp)
                    .align(Alignment.CenterVertically),
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
private fun QuoteCardPreview() {
    val quoteItem = QuoteItem(
        id = 1,
        titleText = "Ты совершил страшное преступление",
        subtitleText = "Ты должен сидеть в тюрьме",
        isPlaying = true,
        isFavorite = true
    )

    QuoteCard(
        quoteItem = quoteItem,
        onClick = {}
    )
}