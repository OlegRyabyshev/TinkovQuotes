package com.example.tinkovquotes.presentation.screen.quotes.compose.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.tinkovquotes.di.appModule
import com.example.tinkovquotes.di.viewModelModule
import com.example.tinkovquotes.presentation.screen.quotes.compose.QuotesScreen
import org.koin.compose.KoinApplication

@Preview
@Composable
private fun QuotesScreenPreview() {
    KoinApplication(application = { modules(appModule, viewModelModule) }) {
        QuotesScreen()
    }
}