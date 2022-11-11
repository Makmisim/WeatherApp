package com.max.weatherapp.adapters

data class WeatherModel(
    val city: String,
    val date: String,
    val condition: String,
    val imageUrl: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val hours: String
)
