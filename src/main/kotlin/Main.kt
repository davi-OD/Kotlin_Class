import kotlin.math.pow

fun main() {

    // Write a program to calculate the difference between your year of birth and the current year
    //

    val current_year = 2023
    val birth_year = 1995

    val age = current_year - birth_year
    println("You are $age years old")

    // 2. c2 = a2 + b2. If a right-angled triangle has base 4cm, height 3cm
    // find the height of the hypotenuse of the triangle
    //
    val hypotenuse:Double
    var height:Int =3
    var base:Int = 4
    val exponent:Int = 2

//    hypotenuse = 4 * 4 + 3 * 2;
    hypotenuse = Math.pow(base.toDouble(),exponent.toDouble()) + Math.pow(height.toDouble(),exponent.toDouble())
    print(hypotenuse)
}