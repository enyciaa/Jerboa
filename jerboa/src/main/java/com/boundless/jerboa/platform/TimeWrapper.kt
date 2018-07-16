package com.boundless.jerboa.platform

interface TimeWrapper {

  fun getTimeMs(year: Int, month: Int, day: Int): Long

  fun getCurrentTimeMs(): Long

  fun areTimeOneAndTwoConsecutiveDays(timeOne: Long, timeTwo: Long): Boolean

  fun areTimeOneAndTwoSameDay(timeOne: Long, timeTwo: Long): Boolean

  fun isToday(timeMs: Long): Boolean

  fun isYesterday(timeMs: Long): Boolean

  fun getMonthOfYear(timeMs: Long): Int

  fun getYear(timeMs: Long): Int

  fun getMonthOfYearActual(timeMs: Long): Int

  fun getDayOfYear(timeMs: Long): Int

  fun getDayOfMonth(timeMs: Long): Int
}
