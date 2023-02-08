package com.victorloveday.spacexyz

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello ${platform.name}. ${daysUntilNewYear()}"
    }
}