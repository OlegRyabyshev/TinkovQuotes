package com.example.tinkovquotes.data.sharedprefs

import android.content.SharedPreferences

class QuotesSharedPreferenceImpl(
    private val sharedPrefs: SharedPreferences
) : QuotesSharedPreference {

    override fun getFavoriteQuotesIdList(): List<Int> =
        sharedPrefs.getStringSet(FAVORITE_QUOTES_SET_KEY, emptySet())
            .orEmpty()
            .map { it.toInt() }

    override fun updateFavoriteState(quoteId: Int, isFavorite: Boolean) {
        val favoriteIdList = getFavoriteQuotesIdList().toMutableSet()

        if (isFavorite) {
            favoriteIdList.add(quoteId)
        } else {
            favoriteIdList.remove(quoteId)
        }

        val favoriteStringIdList = favoriteIdList
            .map { it.toString() }
            .toSet()

        sharedPrefs
            .edit()
            .putStringSet(FAVORITE_QUOTES_SET_KEY, favoriteStringIdList)
            .apply()
    }

    private companion object {
        const val FAVORITE_QUOTES_SET_KEY = "FAVORITE_QUOTES_SET_KEY"
    }
}