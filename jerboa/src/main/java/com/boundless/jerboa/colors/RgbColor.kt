package com.boundless.jerboa.colors

import com.boundless.jerboa.extensions.toIntWithinRange
import kotlin.math.roundToInt

data class RgbColor private constructor(
    val red: Int,
    val green: Int,
    val blue: Int
) {

  companion object {
    fun createFromAbsolutes(red: Int, green: Int, blue: Int): RgbColor {
      return RgbColor(
          red.toIntWithinRange(255),
          green.toIntWithinRange(255),
          blue.toIntWithinRange(255)
      )
    }

    fun createFromPercentages(red: Int, green: Int, blue: Int): RgbColor {
      return RgbColor(
          red.toIntWithinRange(100).toAbsoluteRgbValue(),
          green.toIntWithinRange(100).toAbsoluteRgbValue(),
          blue.toIntWithinRange(100).toAbsoluteRgbValue()
      )
    }

    private fun Int.toAbsoluteRgbValue(): Int = ((this / 100.0) * 255.0).roundToInt()
  }

  val isValid = isValidRgb(red, green, blue)
  val isNotValid = isNotValidRgb(red, green, blue)
}