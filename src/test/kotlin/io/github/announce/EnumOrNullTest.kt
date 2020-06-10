package io.github.announce

import org.junit.Assert.assertEquals
import org.junit.Test

class EnumOrNullTest {
  enum class Direction(val az: Int) {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(240)
  }

  @Test
  fun testEnumValueOrNullWithName() {
    assertEquals(Direction.NORTH, enumValueOrNull<Direction>("NORTH"))
    assertEquals(null, enumValueOrNull<Direction>("north"))
  }

  @Test
  fun testEnumValueOrNullWithFunction() {
    assertEquals(
      Direction.EAST,
      enumValueOrNull<Direction> {
        it.az == 90
      }
    )
    assertEquals(
      Direction.SOUTH,
      enumValueOrNull<Direction> {
        it.ordinal == 2
      }
    )
    assertEquals(
      null,
      enumValueOrNull<Direction> {
        it.ordinal == Direction.values().size
      }
    )
  }

  @Test
  fun testStringToEnumOrNull() {
    assertEquals(Direction.WEST, "WEST".toEnumOrNull<Direction>())
    assertEquals(null, "North".toEnumOrNull<Direction>())
  }
}
