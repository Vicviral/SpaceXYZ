package com.victorloveday.spacexyz

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform