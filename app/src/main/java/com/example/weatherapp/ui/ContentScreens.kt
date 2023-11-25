package com.example.weatherapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.weatherapp.ui.screens.TodayWeathr
import com.example.weatherapp.ui.theme.Background_morning
import com.example.weatherapp.ui.theme.Background_night
import com.example.weatherapp.ui.theme.Font_morning
import com.example.weatherapp.ui.theme.Font_night

@Composable
fun WeatherTodayScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background_morning)
            .wrapContentSize(Alignment.Center)
    ) {
        TodayWeathr()
        Text(
            text = "Weather Today Screen",
            fontWeight = FontWeight.Bold,
            color = Font_morning,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WeatherTodayScreenPreview(){
    WeatherTodayScreen()
}

@Composable
fun WeatherTomorrowScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background_morning)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Weather Tomorrow Screen",
            fontWeight = FontWeight.Bold,
            color = Font_morning,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign =  TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WeatherTomorrowScreenPreview(){
    WeatherTomorrowScreen()
}

@Composable
fun WeatherWeekScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background_night)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Weather Week Screen",
            fontWeight = FontWeight.Bold,
            color = Font_night,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign =  TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WeatherWeekScreenPreview(){
    WeatherWeekScreen()
}