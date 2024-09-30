package com.breezemobilearndemo.features.mylearning.apiCall

import com.breezemobilearndemo.features.login.api.opportunity.OpportunityListApi
import com.breezemobilearndemo.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}