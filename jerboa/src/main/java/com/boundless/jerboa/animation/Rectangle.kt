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