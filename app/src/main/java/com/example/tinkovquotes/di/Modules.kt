package com.example.tinkovquotes.di

import android.content.Context
import com.example.tinkovquotes.data.provider.QuotesProvider
import com.example.tinkovquotes.data.provider.QuotesProviderImpl
import com.example.tinkovquotes.data.repository.QuotesRepositoryImpl
import com.example.tinkovquotes.data.sharedprefs.QuotesSharedPreference
import com.example.tinkovquotes.data.sharedprefs.QuotesSharedPreferenceImpl
import com.example.tinkovquotes.domain.interactor.QuotesInteractor
import com.example.tinkovquotes.domain.interactor.QuotesInteractorImpl
import com.example.tinkovquotes.domain.repository.QuotesRepository
import com.example.tinkovquotes.presentation.screen.favoritequotes.viewmodel.FavoriteQuotesViewModel
import com.example.tinkovquotes.presentation.screen.quotes.viewmodel.QuotesViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private const val QUOTES_SHARED_PREFERENCE_NAME = "QUOTES_SHARED_PREFERENCE_NAME"

val appModule = module {
    single<QuotesProvider> {
        QuotesProviderImpl()
    }

    single<QuotesSharedPreference> {
        val sharedPrefs = androidContext()
            .getSharedPreferences(QUOTES_SHARED_PREFERENCE_NAME, Context.MODE_PRIVATE)

        QuotesSharedPreferenceImpl(sharedPrefs)
    }

    single<QuotesRepository> {
        QuotesRepositoryImpl(
            quotesProvider = get(),
            quotesSharedPreference = get()
        )
    }

    single<QuotesInteractor> {
        QuotesInteractorImpl(get())
    }
}

val viewModelModule = module {
    viewModel { QuotesViewModel(get()) }
    viewModel { FavoriteQuotesViewModel(get()) }
}