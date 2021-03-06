package io.github.announce

class Example {
  enum class Direction(val az: Int) {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(240)
  }

  fun printAz01(name: String = "EAST") {
    val direction = enumValueOrNull<Direction>(name) ?: Direction.EAST
    println("az01=${direction.az}")
  }

  fun printAz02(name: String = "EAST") {
    val direction = name.toEnumOrNull<Direction>() ?: Direction.EAST
    println("az02=${direction.az}")
  }

  fun printName01(az: Int = 0) {
    val direction = enumValueOrNull<Direction> {
      it.az == az
    } ?: Direction.NORTH
    println("name03=${direction.name}")
  }

  fun printName02(ordinal: Int = 0) {
    val direction = enumValueOrNull<Direction> {
      it.ordinal == ordinal
    } ?: Direction.NORTH
    println("name03=${direction.name}")
  }
}
