package io.github.announce

/**
 * https://kotlinlang.org/docs/reference/enum-classes.html
 */
@SinceKotlin("1.1")
inline fun <reified T : Enum<T>> enumValueOrNull(name: String) = enumValues<T>().firstOrNull { it.name == name }

@SinceKotlin("1.1")
inline fun <reified T : Enum<T>> enumValueOrNull(predicate: (T) -> Boolean) = enumValues<T>().firstOrNull(predicate)

@SinceKotlin("1.1")
inline fun <reified T : Enum<T>> String.toEnumOrNull(): T? = enumValues<T>().firstOrNull { it.name == this }
