# enum-or-null

[ ![Build Status](https://travis-ci.org/announce/enum-or-null.svg?branch=master) ](https://travis-ci.org/announce/enum-or-null)
[ ![Download](https://api.bintray.com/packages/ymkjp/enum-or-null/enum-or-null-kt/images/download.svg) ](https://bintray.com/ymkjp/enum-or-null/enum-or-null-kt/_latestVersion)

### Why enum-or-null?

In Kotlin, the `valueOf()` method throws an `IllegalArgumentException` if the specified name does not match any of the enum constants defined in the class.
This library provides handy functions to access to the constant value safely.

### Install

The package is available via [jcenter](https://bintray.com/bintray/jcenter?filterByPkgName=enum-or-null-kt).

With Maven:

```xml
<dependency>
  <groupId>io.github.announce</groupId>
  <artifactId>enum-or-null-kt</artifactId>
  <version>1.x.x</version>
  <type>pom</type>
</dependency>
```

With Gradle:

```groovy
implementation 'io.github.announce:enum-or-null-kt:1.x.x'
```

### Usage

The code typically looks like the following:

```kotlin
class Example {
  enum class Direction(val az: Int) {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(240)
  }

  fun printAz01(name: String = "EAST") {
    val direction = enumValueOrNull<Direction>(name) ?: Direction.NORTH
    println("az01=${direction.az}")
  }

  fun printAz02(name: String = "EAST") {
    val direction = name.toEnumOrNull<Direction>() ?: Direction.SOUTH
    println("az02=${direction.az}")
  }
}
```

### Development

Here's how to release the library:

```shell script
# consider using direnv
export BINTRAY_USER="ymkjp"
export BINTRAY_KEY="__YOUR_KEY__"
./gradlew clean build bintrayUpload
```
