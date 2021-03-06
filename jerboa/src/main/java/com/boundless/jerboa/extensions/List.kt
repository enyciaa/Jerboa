package com.boundless.jerboa.extensions

fun <E> List<E>.random(): E? {
    if (isEmpty())
        return null

    return shuffled()
            .take(1)
            .first()
}

fun <E> List<E>.doesNotContain(item: E): Boolean {
    return !contains(item)
}

fun <T> List<T>.containsElementWhere(predicate: (T) -> Boolean): Boolean {
    for (element in this) {
        if (predicate(element))
            return true
    }
    return false
}

fun <T> List<T>.doesNotContainElementWhere(predicate: (T) -> Boolean): Boolean {
    return !this.containsElementWhere(predicate)
}