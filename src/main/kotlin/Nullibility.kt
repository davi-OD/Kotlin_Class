
fun main() {
//    println("Enter name")
//    var d = readln()
//    print(d)

//    println("Enter 1st number")
//    val d = readln().toInt()
//    val d = readLine()
//    println("Enter second number")
//    val e = readln().toInt()
//    val e = readLine()
//    val e = readlnOrNull()


//    val sum = d+e
//    println(sum)

//    Making a variable a nullable
    var actor:String ?= null
    actor = readln()
    println(actor)
//    Safe call
    println(actor?.length)

//    non-null asseted call
    println(actor!!.length)

    var firstNme:String = "This is my father"
    print(firstNme.length)
}