package com.boundless.jerboa.colors

import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldNotEqual
import org.junit.Test

class ColorFunctionsKtTest {

  @Test
  fun givenInvalidHex_whenCheck_thenReturnFalse() {
    val hex = "#030acz"

    val isValid = isValidHexColor(hex)

    isValid shouldEqual false
  }

  @Test
  fun givenValidHex_whenCheck_thenReturnTrue() {
    val hex = "#ffffff"

    val isValid = isValidHexColor(hex)

    isValid shouldEqual true
  }

  @Test
  fun givenInvalidRgb_whenCheck_thenReturnFalse() {
    val isValid = isValidRgb(0, 256, 200)

    isValid shouldEqual false
  }

  @Test
  fun givenValidRgb_whenCheck_thenReturnTrue() {
    val isValid = isValidRgb(0, 0, 0)

    isValid shouldEqual true
  }

  @Test
  fun givenWhite_whenCalculateBrightness_returnMaxBrightnes() {
    val returnedValue = calculateColorBrightness(255, 255, 255)

    returnedValue shouldEqual 1.0
  }

  @Test
  fun givenBlack_whenCalculateBrightness_returnMinBrightnes() {
    val returnedValue = calculateColorBrightness(0, 0, 0)

    returnedValue shouldEqual 0.0
  }

  @Test
  fun givenHexValue_whenConvertToRgb_thenReturnCorrectRgb() {
    val hex = HexColor.create("f", "ff", "ff")

    val rgb = convertHexToRgb(hex)

    rgb.red shouldEqual 255
    rgb.green shouldEqual 255
    rgb.blue shouldEqual 255
  }

  @Test
  fun givenRgb_whenConvertToHex_thenReturnHex() {
    val rgb = RgbColor.createFromAbsolutes(255, 255, 255)

    val hex = convertRgbToHex(rgb)

    hex.colorWithoutHash shouldEqual "FFFFFF"
  }

  @Test
  fun whenGenerateRandomRgb_thenReturn() {
    val rgbFirst = generateRandomRgb()
    val rgbSecond = generateRandomRgb()

    rgbFirst shouldNotEqual rgbSecond
  }
}
