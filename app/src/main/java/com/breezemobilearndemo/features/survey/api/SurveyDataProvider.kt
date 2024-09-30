package com.breezemobilearndemo.features.survey.api

import com.breezemobilearndemo.features.photoReg.api.GetUserListPhotoRegApi
import com.breezemobilearndemo.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}