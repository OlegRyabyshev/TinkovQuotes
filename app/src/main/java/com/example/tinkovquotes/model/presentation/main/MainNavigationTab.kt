package com.example.tinkovquotes.model.presentation.main

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.tinkovquotes.R

enum class MainNavigationTab(
    @StringRes
    val title: Int,
    val outlinedIcon: ImageVector,
    val filledIcon: ImageVector,
    val route: String
) {

    QUOTES_TAB(
        title = R.string.quotes_screen_label,
        outlinedIcon = Icons.Outlined.Home,
        filledIcon = Icons.Filled.Home,
        route = "quotes_tab"
    ),

    VIDEO_CREATOR_TAB(
        title = R.string.creator_screen_label,
        outlinedIcon = Icons.Filled.Add,
        filledIcon = Icons.Filled.AddCircle,
        route = "creator_tab"
    ),

    FAVORITES_TAB(
        title = R.string.favorites_screen_label,
        outlinedIcon = Icons.Outlined.FavoriteBorder,
        filledIcon = Icons.Filled.Favorite,
        route = "favorites_tab"
    )
}