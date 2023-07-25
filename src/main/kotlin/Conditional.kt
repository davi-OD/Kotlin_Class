fun main() {
//    val rain = true
//
//    if(rain){
//        print("Ground is getting wet")
//    } else {
//        print("lets go to the beach")
//    }
//    println("Enter your year of birth")
//    val year = readln()
//
//    if (year == "2000"){
//        print("You are a GenZ")
//    } else if (year == "1989") {
//        println("You are a millenial")
//    } else {
//        println("You are a Gen X")
//    }

    /**
    1996 - 2015 = Gen Z
    1974 - 1995 = Millenial
    1960 - 1973 = Gen X
    0 - 1959 = baby boomer
     * */
//    println("Enter your year of birth")
//    val year = readln()

//    if (year >= "0" &&year <= "1959"){
//        print("You are a Baby Boomer")
//    } else if (year <= "1973") {
//        println("You are a Gen X")
//    } else if (year <= "1995") {
//        println("You are a Millenial")
//    } else if (year <= "2015") {
//        println("You are a Gen Z")
//    } else {
//        println("You are a Futurist")
//    }

//    Works like switch in other languages
//    val weather = readln()
//    when (weather) {
//        "rainy" -> println("Ground is getting wet")
//        "sunny" -> println("Lets go to the beach")
//        else -> println("Just jazz")
//    }

    val namm = readln().toInt()
//    val x = 0..200
//    when (x){
//        0..19 -> print("You were born 19 years ago")
//    }

    when (namm){
        in 0..1959 -> println("You are a baby boomer")
        in 1960..1973 -> println("You are a Gen X")
        in 1974..1995 -> println("You are a millenial")
        in 1996..2015 -> println("You are a Gen Z")
        else -> println("You are in the future")
    }
}

