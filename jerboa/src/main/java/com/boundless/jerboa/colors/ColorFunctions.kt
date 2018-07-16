package com.boundless.jerboa.colors

import com.boundless.jerboa.extensions.isValidHexidecimal
import com.boundless.jerboa.extensions.toIntWithinRange
import java.util.*

fun isValidHexColor(hex: String): Boolean {
  return hex.toLowerCase().matches("#([0-9a-f]{3}|[0-9a-f]{6}|[0-9a-f]{8})".toRegex())
}

fun isNotValidHexColor(hex: String): Boolean = !isValidHexColor(hex)

/**
 * Takes an alpha/red/green/blue part of hex
 * Makes the part 2 digits
 * And returns if valid else returns default
 */
fun toValidHexColorPart(hexPart: String, default: String): String {
  val correctLengthHexPart = when (hexPart.length) {
    0 -> default
    1 -> "$hexPart$hexPart"
    2 -> hexPart
    else -> default
  }
  return if (correctLengthHexPart.isValidHexidecimal()) correctLengthHexPart else default
}

fun isValidRgb(red: Int, green: Int, blue: Int): Boolean {
  var isValid = true
  arrayOf(red, green, blue).forEach {
    if (it !in 0..255)
      isValid = false
  }
  return isValid
}

fun isNotValidRgb(red: Int, green: Int, blue: Int): Boolean = !isValidRgb(red, green, blue)

fun calculateColorBrightness(red: Int, green: Int, blue: Int): Double {
  return (red.toIntWithinRange(255) / 255.0) * 0.2126 +
      (green.toIntWithinRange(255) / 255.0) * 0.7152 +
      (blue.toIntWithinRange(255) / 255.0) * 0.0722
}

fun convertHexToRgb(hexColor: HexColor): RgbColor {
  val parsedHex = hexColor.colorWithoutHash.toLong(radix = 16)

  return RgbColor.createFromAbsolutes(
      (parsedHex shr 16 and 0xFF).toInt(),
      (parsedHex shr 8 and 0xFF).toInt(),
      (parsedHex and 0xFF).toInt()
  )
}

fun convertRgbToHex(rgbColor: RgbColor): HexColor {
  val hexRed = String.format("%02x", rgbColor.red)
  val hexGreen = String.format("%02x", rgbColor.green)
  val hexBlue = String.format("%02x", rgbColor.blue)
  return HexColor.create(hexRed, hexGreen, hexBlue)
}

fun generateRandomRgb(): RgbColor {
  val random = Random()
  return RgbColor.createFromAbsolutes(
      random.nextInt(256),
      random.nextInt(256),
      random.nextInt(256)
  )
}