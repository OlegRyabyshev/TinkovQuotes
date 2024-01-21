package com.example.tinkovquotes.presentation.screen.quotes.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
    onClick: (Int) -> Unit,
    onFavoriteChange: (Int, Boolean) -> Unit
) {
    Card(
        modifier = Modifier
            .height(92.dp)
            .width(220.dp)
            .clip(RoundedCornerShape(10.dp)),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Row {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .clip(RoundedCornerShape(10.dp)),
                onClick = { onClick.invoke(quoteItem.id) }
            ) {
                Text(
                    modifier = Modifier.padding(
                        horizontal = 10.dp,
                        vertical = 10.dp
                    ),
                    text = quoteItem.title,
                    maxLines = 4,
                    overflow = TextOverflow.Ellipsis,
                    style = Typography.titleMedium
                )
            }

            QuoteCardLikeButton(
                modifier = Modifier.align(Alignment.CenterVertically),
                quoteItem = quoteItem,
                onFavoriteChange = onFavoriteChange
            )
        }
    }
}

@Composable
private fun QuoteCardLikeButton(
    modifier: Modifier,
    quoteItem: QuoteItem,
    onFavoriteChange: (Int, Boolean) -> Unit
) {
    val favoriteIcon = if (quoteItem.isFavorite) {
        ImageVector.vectorResource(R.drawable.ic_favorite_filled_24dp)
    } else {
        ImageVector.vectorResource(R.drawable.ic_favorite_24dp)
    }

    IconButton(
        modifier = modifier
            .clip(CircleShape)
            .size(28.dp),
        onClick = { onFavoriteChange.invoke(quoteItem.id, !quoteItem.isFavorite) }
    ) {
        Icon(
            modifier = Modifier
                .fillMaxSize()
                .padding(2.dp),
            imageVector = favoriteIcon,
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
        onClick = {},
        onFavoriteChange = { _, _ -> }
    )
}
