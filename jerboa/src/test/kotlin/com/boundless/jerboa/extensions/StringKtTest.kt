package com.boundless.jerboa.extensions

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class StringKtTest {

  @Test
  fun givenInvalidHexidecimal_whenCheck_returnFalse() {
    val invalidHexidecimal = "az"

    val isValid = invalidHexidecimal.isValidHexidecimal()

    assertThat(isValid).isFalse()
  }

  @Test
  fun givenValidHexidecimal_whenCheck_returnTrue() {
    val invalidHexidecimal = "af"

    val isValid = invalidHexidecimal.isValidHexidecimal()

    assertThat(isValid).isTrue()
  }
}