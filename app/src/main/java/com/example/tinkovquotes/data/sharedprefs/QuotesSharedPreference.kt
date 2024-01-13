package com.example.tinkovquotes.data.sharedprefs

interface QuotesSharedPreference {

    fun getFavoriteQuotesIdList(): List<Int>

    fun updateFavoriteState(quoteId: Int, isFavorite: Boolean)
}