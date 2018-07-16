package com.boundless.jerboa.extensions

fun <E> List<E>.random(): E? {
  if (isEmpty())
    return null

  return shuffled()
      .take(1)
      .first()
}

fun <E> List<E>.doesNotContain(item: E): Boolean = !contains(item)
