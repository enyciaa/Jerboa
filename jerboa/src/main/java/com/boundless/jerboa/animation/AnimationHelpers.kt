package com.boundless.jerboa.animation

fun calculateNewCoordinate(
    startCoordinate: Coordinate,
    angleOfMovementInRadians: Double,
    distance: Double
): Coordinate {
  return Coordinate(
      x = startCoordinate.x + (distance * Math.cos(angleOfMovementInRadians)),
      y = startCoordinate.y + (distance * Math.sin(angleOfMovementInRadians))
  )
}

fun reverseDirectionWithRadians(radians: Double): Double {
  if (radians < 0.0 || radians > 6.2832)
    throw RuntimeException("Radians invalid. Received $radians but must be in range 0-6.283")


  val degrees = Math.toDegrees(radians)
  return Math.toRadians(reverseDirectionWithDegrees(degrees))
}

fun reverseDirectionWithDegrees(degrees: Double): Double {
  if (degrees < 0.0 || degrees > 360.0)
    throw RuntimeException("Degrees invalid. Received $degrees but must be in range 0-360")

  return if (degrees > 180)
    degrees - 180
  else
    degrees + 180
}