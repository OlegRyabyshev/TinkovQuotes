package com.example.tinkovquotes.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.List
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.tinkovquotes.R
import com.example.tinkovquotes.presentation.theme.TinkovQuotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TinkovQuotesTheme {
                Scaffold(
                    bottomBar = { MainBottomNavigationBar() }
                ) { padding ->
                    Surface(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(padding),
                        color = MaterialTheme.colorScheme.background
                    ) {

                    }
                }
            }
        }
    }
}

@Composable
@Preview
private fun MainBottomNavigationBar() {
    BottomAppBar {
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.List,
                    contentDescription = stringResource(id = R.string.quotes_screen_label)
                )
            },
            label = {
                Text(text = stringResource(id = R.string.quotes_screen_label))
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Edit,
                    contentDescription = stringResource(id = R.string.creator_screen_label)
                )
            },
            label = {
                Text(text = stringResource(id = R.string.creator_screen_label))
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Favorite,
                    contentDescription = stringResource(id = R.string.favorites_screen_label)
                )
            },
            label = {
                Text(text = stringResource(id = R.string.favorites_screen_label))
            }
        )
    }
}