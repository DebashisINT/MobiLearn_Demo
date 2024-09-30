package com.breezemobilearndemo.features.lead.api

import com.breezemobilearndemo.features.NewQuotation.api.GetQuotListRegRepository
import com.breezemobilearndemo.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}