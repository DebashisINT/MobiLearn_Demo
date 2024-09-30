package com.breezemobilearndemo.features.weather.api

import com.breezemobilearndemo.features.task.api.TaskApi
import com.breezemobilearndemo.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}