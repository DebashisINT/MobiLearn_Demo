package com.breezemobilearndemo.features.document.api

import com.breezemobilearndemo.features.dymanicSection.api.DynamicApi
import com.breezemobilearndemo.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}