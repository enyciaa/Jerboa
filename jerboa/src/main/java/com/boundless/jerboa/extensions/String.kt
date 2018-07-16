package com.boundless.jerboa.extensions

fun String.toIntOrZero(): Int = this.toIntOrNull() ?: 0

fun String.toLongOrZero(): Long = this.toLongOrNull() ?: 0

fun String.isValidHexidecimal(): Boolean {
  return matches("^[0-9a-fA-F]*\$".toRegex())
}

fun String?.isNotNullOrEmpty(): Boolean = !isNullOrEmpty()
