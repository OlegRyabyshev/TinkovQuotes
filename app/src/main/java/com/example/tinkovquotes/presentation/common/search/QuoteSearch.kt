package com.example.tinkovquotes.presentation.common.search

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tinkovquotes.R

@Composable
fun QuoteSearch(
    searchText: String,
    onTextChange: (String) -> Unit
) {
    Surface(
        modifier = Modifier
            .padding(
                horizontal = 16.dp,
                vertical = 8.dp
            )
            .fillMaxWidth()
            .height(52.dp)
    ) {
        TextField(
            modifier = Modifier.fillMaxSize(),
            value = searchText,
            onValueChange = onTextChange,
            leadingIcon = {
                Icon(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .size(24.dp),
                    imageVector = Icons.Filled.Search,
                    contentDescription = null
                )
            },
            placeholder = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = stringResource(R.string.search_hint),
                    maxLines = 1
                )
            },
            maxLines = 1,
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = CircleShape
        )
    }
}

@Composable
@Preview
private fun QuoteSearchPreview() {
    QuoteSearch(
        searchText = stringResource(R.string.search_hint),
        onTextChange = {}
    )
}