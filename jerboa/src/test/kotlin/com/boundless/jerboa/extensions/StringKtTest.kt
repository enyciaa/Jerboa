package com.boundless.jerboa.extensions

import org.amshove.kluent.shouldEqual
import org.junit.Test

class StringKtTest {

  @Test
  fun givenInvalidHexidecimal_whenCheck_returnFalse() {
    val invalidHexidecimal = "az"

    val isValid = invalidHexidecimal.isValidHexidecimal()

    isValid shouldEqual false
  }

  @Test
  fun givenValidHexidecimal_whenCheck_returnTrue() {
    val invalidHexidecimal = "af"

    val isValid = invalidHexidecimal.isValidHexidecimal()

    isValid shouldEqual true
  }
}