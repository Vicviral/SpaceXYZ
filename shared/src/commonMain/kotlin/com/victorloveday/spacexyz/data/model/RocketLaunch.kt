package com.victorloveday.spacexyz.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *Created by Victor Loveday on 2/8/23
 */
@Serializable
data class RocketLaunch (
    @SerialName("flight_number")
    val flightNumber: Int,
    @SerialName("name")
    val missionName: String,
    @SerialName("date_utc")
    val launchDateUTC: String,
    @SerialName("success")
    val launchSuccess: Boolean?
)
