package com.breezemobilearndemo.features.activities.api

import com.breezemobilearndemo.features.member.api.TeamApi
import com.breezemobilearndemo.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}