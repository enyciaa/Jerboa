package com.boundless.jerboa.animation

/**
 * Assumes platform has a origin of 0,0 in the top left corner
 */
data class Rectangle(
        val width: Double,
        val height: Double,
        val center: Coordinate
) {

    val left = center.x - width / 2
    val top = center.y - height / 2
    val right = left + width
    val bottom = top + height

    fun isInBounds(coordinate: Coordinate): Boolean {
        if (coordinate.x > left &&
            coordinate.x < right &&
            coordinate.y > top &&
            coordinate.y < bottom
        ) {
            return true
        }

        return false
    }
}

fun Rectangle.translateDown(translation: Float): Rectangle {
    val newCenterCoordinate = this.center.copy(y = this.center.y + translation)
    return this.copy(center = newCenterCoordinate)
}

fun Rectangle.translateUp(translation: Float): Rectangle {
    val newCenterCoordinate = this.center.copy(y = this.center.y - translation)
    return this.copy(center = newCenterCoordinate)
}

fun Rectangle.translateLeft(translation: Float): Rectangle {
    val newCenterCoordinate = this.center.copy(x = this.center.x - translation)
    return this.copy(center = newCenterCoordinate)
}

fun Rectangle.translateRight(translation: Float): Rectangle {
    val newCenterCoordinate = this.center.copy(x = this.center.x + translation)
    return this.copy(center = newCenterCoordinate)
}

fun Rectangle.isOffBottomOfBounds(bounds: Rectangle): Boolean {
    if (this.top > bounds.bottom) {
        return true
    }

    return false
}

fun Rectangle.isInBoundsOf(rectangle: Rectangle): Boolean {
    if (this.left > rectangle.left &&
        this.right < rectangle.right &&
        this.top > rectangle.top &&
        this.bottom < rectangle.bottom
    ) {
        return true
    }

    return false
}