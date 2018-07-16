package com.boundless.jerboa.colors

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ColorFunctionsKtTest {

  @Test
  fun givenInvalidHex_whenCheck_thenReturnFalse() {
    val hex = "#030acz"

    val isValid = isValidHexColor(hex)

    assertThat(isValid).isFalse()
  }

  @Test
  fun givenValidHex_whenCheck_thenReturnTrue() {
    val hex = "#ffffff"

    val isValid = isValidHexColor(hex)

    assertThat(isValid).isTrue()
  }

  @Test
  fun givenInvalidRgb_whenCheck_thenReturnFalse() {
    val isValid = isValidRgb(0, 256, 200)

    assertThat(isValid).isFalse()
  }

  @Test
  fun givenValidRgb_whenCheck_thenReturnTrue() {
    val isValid = isValidRgb(0, 0, 0)

    assertThat(isValid).isTrue()
  }

  @Test
  fun givenWhite_whenCalculateBrightness_returnMaxBrightnes() {
    val returnedValue = calculateColorBrightness(255, 255, 255)

    assertThat(returnedValue).isEqualTo(1.0)
  }

  @Test
  fun givenBlack_whenCalculateBrightness_returnMinBrightnes() {
    val returnedValue = calculateColorBrightness(0, 0, 0)

    assertThat(returnedValue).isEqualTo(0.0)
  }

  @Test
  fun givenHexValue_whenConvertToRgb_thenReturnCorrectRgb() {
    val hex = HexColor.create("f", "ff", "ff")

    val rgb = convertHexToRgb(hex)

    assertThat(rgb.red).`as`("red").isEqualTo(255)
    assertThat(rgb.green).`as`("green").isEqualTo(255)
    assertThat(rgb.blue).`as`("blue").isEqualTo(255)
  }

  @Test
  fun givenRgb_whenConvertToHex_thenReturnHex() {
    val rgb = RgbColor.createFromAbsolutes(255, 255, 255)

    val hex = convertRgbToHex(rgb)

    assertThat(hex.colorWithoutHash).isEqualTo("FFFFFF")
  }

  @Test
  fun whenGenerateRandomRgb_thenReturn() {
    val rgbFirst = generateRandomRgb()
    val rgbSecond = generateRandomRgb()

    assertThat(rgbFirst).isNotEqualTo(rgbSecond)
  }
}
