package com.example.tinkovquotes.model.presentation.main

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.tinkovquotes.R

enum class MainNavigationTab(
    @StringRes val title: Int,
    @DrawableRes val outlinedIcon: Int,
    @DrawableRes val filledIcon: Int,
    val route: String
) {

    QUOTES_TAB(
        title = R.string.quotes_screen_label,
        outlinedIcon = R.drawable.ic_media_24dp,
        filledIcon = R.drawable.ic_media_filled_24dp,
        route = "quotes_tab"
    ),

    VIDEO_CREATOR_TAB(
        title = R.string.creator_screen_label,
        outlinedIcon = R.drawable.ic_movie_24dp,
        filledIcon = R.drawable.ic_movie_filled_24dp,
        route = "creator_tab"
    ),

    FAVORITE_QUOTES_TAB(
        title = R.string.favorites_screen_label,
        outlinedIcon = R.drawable.ic_favorite_24dp,
        filledIcon = R.drawable.ic_favorite_filled_24dp,
        route = "favorite_quotes_tab"
    )
}