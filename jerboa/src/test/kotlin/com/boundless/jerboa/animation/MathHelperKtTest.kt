package com.boundless.jerboa.animation

import org.amshove.kluent.`should be greater or equal to`
import org.amshove.kluent.`should be less or equal to`
import org.junit.Test

class MathHelperKtTest {

  @Test
  fun givenPositiveValues_whenGenerateRandomNumberInRange_thenResultInRange() {
    val min = 20
    val max = 40

    val result = randomNumberInRange(min, max)

    result `should be greater or equal to` min
    result `should be less or equal to`  max
  }

  @Test
  fun givenNegativeValues_whenGenerateRandomNumberInRange_thenResultInRange() {
    val min = -40
    val max = -20

    val result = randomNumberInRange(min, max)

    result `should be greater or equal to` min
    result `should be less or equal to`  max
  }
}