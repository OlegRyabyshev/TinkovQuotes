package com.example.tinkovquotes.presentation.common.search

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuoteSearch() {
    SearchBar(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 16.dp,
                end = 16.dp,
                bottom = 8.dp
            ),
        query = "",
        onQueryChange = {},
        onSearch = {},
        active = false,
        placeholder = { Text("Искать цитату") },
        onActiveChange = {}
    ) {

    }
}

@Composable
@Preview
private fun QuoteSearchPreview() {
    QuoteSearch()
}