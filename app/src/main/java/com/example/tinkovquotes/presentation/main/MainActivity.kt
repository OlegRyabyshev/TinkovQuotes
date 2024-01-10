package com.example.tinkovquotes.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tinkovquotes.model.presentation.main.MainNavigationTab.FAVORITES_TAB
import com.example.tinkovquotes.model.presentation.main.MainNavigationTab.QUOTES_TAB
import com.example.tinkovquotes.model.presentation.main.MainNavigationTab.VIDEO_CREATOR_TAB
import com.example.tinkovquotes.presentation.screen.favorites.compose.FavoritesScreen
import com.example.tinkovquotes.presentation.screen.quotes.compose.QuotesScreen
import com.example.tinkovquotes.presentation.screen.videocreator.VideoCreatorScreen
import com.example.tinkovquotes.presentation.theme.TinkovQuotesTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TinkovQuotesTheme {
                val rootNavHostController = rememberNavController()


                Scaffold(
                    bottomBar = {
                        MainBottomAppBar(
                            rootNavController = rootNavHostController
                        )
                    }
                ) { padding ->
                    MainContent(
                        modifier = Modifier.padding(padding),
                        rootNavHostController = rootNavHostController
                    )
                }
            }
        }
    }
}

@Composable
private fun MainContent(
    rootNavHostController: NavHostController,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        NavHost(
            navController = rootNavHostController,
            startDestination = QUOTES_TAB.route
        ) {
            composable(QUOTES_TAB.route) {
                QuotesScreen()
            }

            composable(VIDEO_CREATOR_TAB.route) {
                VideoCreatorScreen()
            }

            composable(FAVORITES_TAB.route) {
                FavoritesScreen()
            }
        }
    }
}