package com.victorloveday.spacexyz

import kotlinx.datetime.*

/**
 *Created by Victor Loveday on 2/8/23
 */

fun daysUntilNewYear(): String {
    val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
    val closestPreviousNewYear = LocalDate(today.year, 1, 1)
    val closestNewYear = LocalDate(today.year + 1, 1, 1)
    val daysLived = closestPreviousNewYear.daysUntil(today)
    return "We hava lived for $daysLived, and we have ${today.daysUntil(closestNewYear)} left to New Year."
}