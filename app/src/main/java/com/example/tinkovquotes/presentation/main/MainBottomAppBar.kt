package com.example.tinkovquotes.presentation.main

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.tinkovquotes.model.presentation.main.MainNavigationTab

@Composable
fun MainBottomAppBar(
    rootNavController: NavController
) {
    val currentBackStackEntry by rootNavController.currentBackStackEntryAsState()
    val currentDestinationRoute = currentBackStackEntry?.destination?.route

    BottomAppBar {
        MainNavigationTab.entries.forEach { tab ->
            val isSelected = tab.route == currentDestinationRoute
            val titleText = stringResource(tab.title)

            NavigationBarItem(
                selected = isSelected,
                icon = {
                    Icon(
                        imageVector = if (isSelected) tab.filledIcon else tab.outlinedIcon,
                        contentDescription = titleText
                    )
                },
                label = {
                    Text(text = titleText)
                },
                onClick = {
                    rootNavController.navigate(tab.route) {
                        val startDestination = rootNavController.graph.findStartDestination().id

                        popUpTo(startDestination) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}