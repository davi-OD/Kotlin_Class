package assignment2

fun main() {
    /**
    2. A car is moving at a speed of 1000m/s at an acceleration of
    25m/s^2. Find the time it will take to move a distance of 5km
    acceleration = speed/time, speed = distance/time
     */
    var speed = 1000

    var acceleration = 25
//    Distance in m
    var distance = 5 * 1000

    val time = distance/speed
    println(time)
}