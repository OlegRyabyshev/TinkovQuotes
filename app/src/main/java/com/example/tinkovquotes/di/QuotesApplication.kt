package com.example.tinkovquotes.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class QuotesApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@QuotesApplication)
            modules(appModule, viewModelModule)
        }
    }
}