package com.victorloveday.spacexyz

import com.victorloveday.spacexyz.data.model.RocketLaunch
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class APIClient {
    private val platform: Platform = getPlatform()

    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
    }

    @Throws(Exception::class)
    suspend fun showLastRocketLaunch(): String {
        val rockets: List<RocketLaunch> = httpClient.get { "https://api.spacexdata.com/v4/launches" }.body()
        val lastSuccessfulLaunch = rockets.last{it.launchSuccess == true}

        return "Hello, I'm ${platform.name}. The last successful launch to space was ${lastSuccessfulLaunch.launchDateUTC} \n " +
                "And yeah!!! We have ${daysUntilNewYear()} until new year 🎸🚀"
    }
}