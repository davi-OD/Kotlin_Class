import kotlin.math.sqrt

fun main() {
    findTime()
    solveQuad()
    squareRootOfComplex()
}

fun findTime() {
    val speed = 1000
    val distance = 5000

    val time = distance/speed
    println("This time it will take will be $time seconds")
}

fun solveQuad() {
    /**
     * x^3+7x^2+10x=0
     * x(x^2+7x+10)=0
     * x =0 or x^2+7x+10=0
     */

    val d= (7*7)-(4*1*10)
    val x1 = 0
    val x2 = (-7 - sqrt(d.toDouble()))/(2*1)
    val x3 = (-7 + sqrt(d.toDouble()))/(2*1)

    println("The roots are x1 =$x1, x2 = $x2, x3 = $x3")
}

fun squareRootOfComplex() {
    val x = sqrt(-9.0)
    print(x)
}