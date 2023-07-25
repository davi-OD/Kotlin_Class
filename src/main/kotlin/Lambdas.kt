
fun main() {
val add = {a:Int -> print(a)}
    add(5)

    val addThreeNum = {a:Int, b:Int, c:Int -> a+b+c}
    val answer = addThreeNum(3,4,6)
    println(answer)
//    concatenationStrings("trees","are green", eat)
    addNumbers(2,4)
}

//val eat = {x:String,y:String -> print(x+y) }
//
//fun concatenationStrings(a:String, b:String, x:(String, String)->Unit){
//    x(a,b)
//}

//fun add(a:Int) {print(a)}

fun addNumbers(a:Int, b:Int) {
    val x = a + b

    println("The sum of $a and $b is $x")
}

