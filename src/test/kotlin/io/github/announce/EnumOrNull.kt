package io.github.announce

import org.junit.Assert.assertEquals
import org.junit.Test

class EnumOrNullTest {
  enum class Direction {
    NORTH, SOUTH, WEST, EAST
  }
  @Test
  fun testEnumValueOrNull() {
    assertEquals(Direction.NORTH, enumValueOrNull<Direction>("NORTH"))
    assertEquals(null, enumValueOrNull<Direction>("north"))
  }
}
