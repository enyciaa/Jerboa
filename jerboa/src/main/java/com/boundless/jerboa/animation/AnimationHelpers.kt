package com.boundless.jerboa.animation

import kotlin.random.Random

/**
 * Convert these to use an entity class of Angle
 * which takes a radian or degree
 * Check validity of angle on creation
 *
 * Add extension function to reverse direction
 */

fun reverseDirectionWithRadians(radians: Double): Double {
    if (radians < 0.0 || radians > 6.2832)
        throw RuntimeException("Radians invalid. Received $radians but must be in range 0-6.283")

    val degrees = Math.toDegrees(radians)
    return Math.toRadians(reverseDirectionWithDegrees(degrees))
}

fun reverseDirectionWithDegrees(degrees: Double): Double {
    if (degrees < 0.0 || degrees > 360.0)
        throw RuntimeException("Degrees invalid. Received $degrees but must be in range 0-360")

    return if (degrees > 180)
        degrees - 180
    else
        degrees + 180
}

fun randomAngleInRadians(): Double {
    return Math.toRadians(Random.nextDouble(0.0, 360.0))
}

fun randomAngleInDegrees(): Double {
    return Random.nextDouble(0.0, 360.0)
}