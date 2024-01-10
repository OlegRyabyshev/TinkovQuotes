package com.example.tinkovquotes.di

import com.example.tinkovquotes.data.provider.QuotesProvider
import com.example.tinkovquotes.data.provider.QuotesProviderImpl
import com.example.tinkovquotes.data.repository.QuotesRepositoryImpl
import com.example.tinkovquotes.domain.interactor.QuotesInteractor
import com.example.tinkovquotes.domain.interactor.QuotesInteractorImpl
import com.example.tinkovquotes.domain.repository.QuotesRepository
import com.example.tinkovquotes.presentation.screen.quotes.viewmodel.QuotesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<QuotesProvider> {
        QuotesProviderImpl()
    }

    single<QuotesRepository> {
        QuotesRepositoryImpl(get())
    }

    single<QuotesInteractor> {
        QuotesInteractorImpl(get())
    }
}

val viewModelModule = module {
    viewModel { QuotesViewModel(get()) }
}