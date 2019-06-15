package com.boundless.jerboa.animation

data class Coordinate(
        val x: Double,
        val y: Double
)

fun Coordinate.isInBounds(bounds: Rectangle): Boolean {
    if (x > bounds.left &&
        x < bounds.right &&
        y > bounds.top &&
        y < bounds.bottom
    ) {
        return true
    }

    return false
}

fun Coordinate.move(
        angleOfMovementInRadians: Double,
        distance: Double
): Coordinate {
    return Coordinate(
            x = x + (distance * Math.cos(angleOfMovementInRadians)),
            y = y + (distance * Math.sin(angleOfMovementInRadians))
    )
}
