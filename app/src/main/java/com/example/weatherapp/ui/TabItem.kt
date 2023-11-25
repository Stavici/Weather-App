package com.example.weatherapp.ui

import androidx.compose.runtime.Composable

typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var title: String, var screen: ComposableFun){
    object TodayWeather : TabItem ("Today", { WeatherTodayScreen()})
    object TomorrowWeather : TabItem("Tomorrow", { WeatherTomorrowScreen()})
    object WeekWeather : TabItem("6 Days", { WeatherWeekScreen()})
}
