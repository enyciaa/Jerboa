package com.boundless.jerboa.extensions

infix fun Int.hasFlag(flag: Int) = flag and this == flag

infix fun Int.withFlag(flag: Int) = this or flag

infix fun Int.minusFlag(flag: Int) = this and flag.inv()

infix fun Int.addFlag(flag: Int) = this or flag
