package com.boundless.jerboa.animation

fun randomNumberInRange(
        min: Int,
        max: Int
): Int =
        randomNumberInRange(min.toDouble(), max.toDouble())
                .toInt()

fun randomNumberInRange(
        min: Double,
        max: Double
): Double {
    val range = max - min
    return min + Math.random() * range
}

fun randomAngleInRadians(): Double {
    return Math.toRadians(randomNumberInRange(0.0, 360.0))
}

fun randomAngleInDegrees(): Double {
    return randomNumberInRange(0.0, 360.0)
}