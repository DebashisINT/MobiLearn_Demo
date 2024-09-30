package com.breezemobilearndemo.features.weather.api

import com.breezemobilearndemo.base.BaseResponse
import com.breezemobilearndemo.features.task.api.TaskApi
import com.breezemobilearndemo.features.task.model.AddTaskInputModel
import com.breezemobilearndemo.features.weather.model.ForeCastAPIResponse
import com.breezemobilearndemo.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}