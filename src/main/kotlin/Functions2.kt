
fun main() {
    println("Enter the first number:")
    val firstNumber = readln().toInt()
    println("Enter the second number:")
    val secondNumber = readln().toInt()

    addTwoNumbers(firstNumber, secondNumber)

    println("Enter the first number:")
    val thirdNumber = readln().toFloat()
    println("Enter the second number:")
    val fouthNumber = readln().toFloat()
    println("Enter the second number:")
    val fifthNumber = readln().toFloat()

    multiplyThreeFloats(thirdNumber, fouthNumber, fifthNumber)

    val answer = addTwoNumbers(firstNumber,secondNumber) * 499
    println("The sum of $firstNumber and $secondNumber is $answer")
}



//fun addTwoNumbers(a:Int, b:Int) {
//    val x = a + b
//
//    println("The sum of $a and $b is $x")
//}

fun addTwoNumbers(a:Int, b:Int):Int {
    val x = a + b
    return x

}

fun multiplyThreeFloats(a:Float,b:Float,c:Float) {
    val m = a*b*c
    println("The multiple of $a, $b and $c is $m")
}