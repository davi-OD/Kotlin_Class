package assignment2

import kotlin.math.sqrt

fun main() {
    /**
    4. solve the equation x^3+7x^2+10x = 0
     */
    val a = 1.0
    val b = 7.0
    val c = 10.0
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