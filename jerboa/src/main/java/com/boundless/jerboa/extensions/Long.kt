package com.boundless.jerboa.extensions

fun Long.isGreaterThan(value: Long): Boolean = this > value

fun Long.isGreaterThanOrEqualTo(value: Long): Boolean = this >= value

fun Long.isLessThan(value: Long): Boolean = this < value

fun Long.isLessThanOrEqualTo(value: Long): Boolean = this <= value

fun Long.isEqualTo(value: Long): Boolean = this == value

fun Long.isNotEqualTo(value: Long): Boolean = this != value