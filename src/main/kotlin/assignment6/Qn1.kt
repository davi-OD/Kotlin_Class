package assignment6

fun main() {
    //1. Create a list of 10 integers, 89,45,23,5,67,12,55,89,54,55
    // and print them out in ascending order

    val numbersList = listOf<Int>(89,45,23,5,67,12,55,89,54,55)
    val sortedList = numbersList.sorted()
    println(sortedList)

    for (i in sortedList) println(i)

}