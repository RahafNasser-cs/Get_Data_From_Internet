package com.example.datafrominternet.internet

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

//data class AllData(val error: Boolean, val msg: String, @field:Json(name = "data") val data: List<DataItem>)
////data class CountryData(val data: Country)
////data class Country(@field:Json(name = "data") val data: List<DataItem>)
//data class DataItem(val country: String, val cities: String)
////data class DataItem(@field:Json(name = "country")val country: String, @field:Json(name = "cities") val cities: String)

@JsonClass(generateAdapter = true)
data class AllData(val error: Boolean, val msg: String, val data: List<DataItem>)
data class DataItem(val name: String, val flag: String)
//data class Citiy( @field:Json(name = ""))