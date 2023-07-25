package assignment2

import kotlin.math.sqrt

fun main(){
    /**
    1. Solve the equation x^2+10x+25= 0 - x = (-b +- sqrt(b2-4ac))/2a
     */
    val a = 1.0
    val b = 2.0
    val c = 3.0
    val rt1: Double
    val rt2: Double
    val ans: String

    val det = b*b - 4.0 * a*c
    if (det > 0) {
        rt1 = (-b+ sqrt(det))/(2*a)
        rt2 = (-b - sqrt(det))/(2*a)
        ans = "rt1 = $rt1 and rt2=$rt2"

    } else if (det == 0.0) {
        rt2 = -b/(2*a)
        rt1 = rt2
        ans = "rt1 = rt2 = $rt1"
    } else {
        val reaPart = -b /(2*a)
        val imPart = sqrt(det) /(2*a)
        ans = "rt1 = $reaPart + $imPart and rt2 = $reaPart-$imPart"
    }
    println(ans)

}