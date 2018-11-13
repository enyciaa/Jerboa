package com.boundless.jerboa.extensions

import kotlin.math.roundToInt

fun Int.isGreaterThan(value: Int): Boolean = this > value

fun Int.isGreaterThanOrEqualTo(value: Int): Boolean = this >= value

fun Int.isLessThan(value: Int): Boolean = this < value

fun Int.isLessThanOrEqualTo(value: Int): Boolean = this <= value

fun Int.isEqualTo(value: Int): Boolean = this == value

fun Int.isNotEqualTo(value: Int): Boolean = this != value

fun Int.toIntWithinRange(
        max: Int,
        min: Int = 0
): Int {
    return when {
        this < min -> min
        this > max -> max
        else       -> this
    }
}

/**
 * Assumes the minimum is always 0.0
 */
fun Int.toPercentage(max: Double): Int = ((this / max) * 100.0).roundToInt()

