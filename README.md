# enum-or-null

### Why enum-or-null?

In Kotlin, the `valueOf()` method throws an `IllegalArgumentException` if the specified name does not match any of the enum constants defined in the class.
This library provides a handy function `enumValueOrNull` to access to the defined value safely.

### Install

With Maven:

```xml<dependency>
    <groupId>o.github.announce</groupId>
    <artifactId>enum-or-null-kt</artifactId>
    <version>1.0.0</version>
</dependency>
```

With Gradle:

```groovy
compile group: 'io.github.announce', name: 'enum-or-null-kt', version: '1.0.0'
```

### Usage

```kotlin
import io.github.announce.enumValueOrNull

class Example {
  enum class Direction(val az: Int) {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(240)
  }

  fun printAz(name: String = "EAST") { 
    val direction = enumValueOrNull<Direction>(name) ?: Direction.NORTH
    println("az=${direction.az}")
  }
}
```

### Development

