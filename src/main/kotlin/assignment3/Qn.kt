package assignment3

fun main() {
    println("Enter first number:")
    val firstDouble = readln().toDouble()
    println("Enter second number:")
    val secondDouble = readln().toDouble()
    println("Enter a character i.e. '*,+,-,/'")
    val characterX = readln()[0]
    actionUser(firstDouble, secondDouble, characterX)
}

fun actionUser(a:Double, b:Double, c:Char) {
    val ansr: Double
    when (c) {
        '*' -> {
            ansr = a * b
            println("The multiplication of $a and $b is $ansr")
        }
        '+' -> {
            ansr = a + b
            println("The sum of $a and $b is $ansr")
        }
        '-' -> {
            ansr = a - b
            println("The difference between $a and $b is $ansr")
        }
        '/' -> {
            ansr = a / b
            println("The division of $a and $b is $ansr")
        }
        else -> {
            println("Enter a recognized character")
        }
    }
}
/**
//write a function that has three parameters; two doubles and one character
//(*, +, -, /) and checks if third parameter
// == *, it will multiply the two doubles
// == +, it will add the two numbers
// == -, it will subtract the two numbers
// == /, it will divide the two numbers
 * */

