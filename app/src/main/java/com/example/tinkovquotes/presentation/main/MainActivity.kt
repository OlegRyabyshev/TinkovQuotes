package com.example.tinkovquotes.presentation.main

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import com.example.tinkovquotes.model.presentation.main.MainNavigationTab.FAVORITE_QUOTES_TAB
import com.example.tinkovquotes.model.presentation.main.MainNavigationTab.QUOTES_TAB
import com.example.tinkovquotes.model.presentation.main.MainNavigationTab.VIDEO_CREATOR_TAB
import com.example.tinkovquotes.presentation.screen.favoritequotes.compose.FavoriteQuotesScreen
import com.example.tinkovquotes.presentation.screen.quotes.compose.QuotesScreen
import com.example.tinkovquotes.presentation.screen.videocreator.VideoCreatorScreen
import com.example.tinkovquotes.presentation.theme.TinkovQuotesTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT),
            navigationBarStyle = SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT)
        )

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
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(
                                top = padding.calculateTopPadding(),
                                bottom = padding.calculateBottomPadding()
                            ),
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

            composable(FAVORITE_QUOTES_TAB.route) {
                FavoriteQuotesScreen()
            }
        }
    }
}