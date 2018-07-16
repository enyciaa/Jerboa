package com.boundless.jerboa.animation

import org.amshove.kluent.shouldEqual
import org.junit.Test

class AnimationHelpersKtTest {

  @Test
  fun givenStartAngleAndDirection_whenCalculateNewCoordinate_thenCalculateCorrectly() {
    val startCoordinate = Coordinate(0.0, 0.0)

    val newCoordinate = calculateNewCoordinate(startCoordinate, 0.2,  10.0)

    newCoordinate shouldEqual Coordinate(9.800665778412416, 1.9866933079506122)
  }

  @Test
  fun givenRadians_whenReverseDirection_thenResultCorrect() {
    val newDirection = reverseDirectionWithRadians(6.28318)

    newDirection shouldEqual 3.1415873464102058
  }

  @Test(expected = RuntimeException::class)
  fun givenInvalidRadians_whenReverseDirection_thenException() {
    reverseDirectionWithRadians(7.0)
  }

  @Test
  fun givenDegrees_whenReverseDirection_thenResultCorrect() {
    val newDirection = reverseDirectionWithDegrees(360.0)

    newDirection shouldEqual 180.0
  }

  @Test(expected = RuntimeException::class)
  fun givenInvalidDegrees_whenReverseDirection_thenException() {
    reverseDirectionWithDegrees(580.0)
  }
}

