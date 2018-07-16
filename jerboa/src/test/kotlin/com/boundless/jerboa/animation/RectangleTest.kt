package com.boundless.jerboa.animation

import org.amshove.kluent.shouldEqual
import org.junit.Test

class RectangleTest {

  @Test
  fun givenCenterWidthAndHeight_whenCreated_thenBoundsCorrect() {
    val result = Rectangle(2.0, 2.0, Coordinate(10.0, 10.0))

    result.left shouldEqual 9.0
    result.top shouldEqual 9.0
    result.right shouldEqual 11.0
    result.bottom shouldEqual 11.0
  }

  @Test
  fun givenCoordinateInBounds_whenCheck_thenTrue() {
    val rectangle = Rectangle(2.0, 2.0, Coordinate(10.0, 10.0))

    val result = rectangle.isInBounds(Coordinate(10.0, 10.0))

    result shouldEqual true
  }

  @Test
  fun givenCoordinateNotInBounds_whenCheck_thenFalse() {
    val rectangle = Rectangle(2.0, 2.0, Coordinate(10.0, 10.0))

    val result = rectangle.isInBounds(Coordinate(20.0, 10.0))

    result shouldEqual false
  }
}