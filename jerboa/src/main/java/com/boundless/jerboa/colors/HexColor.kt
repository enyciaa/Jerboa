package com.boundless.jerboa.colors

data class HexColor private constructor(
        private val red: String,
        private val green: String,
        private val blue: String
) {

    companion object {
        private const val DEFAULT_VALUE = "FF"

        fun create(
                red: String,
                green: String,
                blue: String
        ): HexColor {
            return HexColor(
                    toValidHexColorPart(red, DEFAULT_VALUE),
                    toValidHexColorPart(green, DEFAULT_VALUE),
                    toValidHexColorPart(blue, DEFAULT_VALUE)
            )
        }
    }

    val colorWithoutHash =
            if (getUpperCaseHex().startsWith("#"))
                getUpperCaseHex().trimStart('#')
            else
                getUpperCaseHex()

    val colorWithHash =
            if (getUpperCaseHex().startsWith("#"))
                getUpperCaseHex()
            else
                "#${getUpperCaseHex()}"

    private fun getUpperCaseHex() = "$red$green$blue".toUpperCase()

    val isValid = isValidHexColor(colorWithHash)
    val isNotValid = isNotValidHexColor(colorWithHash)
}
