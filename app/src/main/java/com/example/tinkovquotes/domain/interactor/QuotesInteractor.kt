package com.example.tinkovquotes.domain.interactor

import com.example.tinkovquotes.model.domain.quote.QuoteDomainModel

interface QuotesInteractor {

    fun getQuotesList(): List<QuoteDomainModel>
}