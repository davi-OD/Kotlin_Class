package assignment2

fun main() {

    /**
     5. A person is moving to his village with a car moving at 20km/h,
     and He has many alternative routes.
     If he uses route1, he'll move a distance of 5000km
     If he uses route2, he'll move a distance of 25000km
     If he uses route3, he'll move a distance of 50000km
     If he uses another, he'll move a distance of 10000km
     find the time it will take him to reach the village using the
     separate routes
     -using if statement
     -using when statement
     */
//    Using if statement
    val speed = 20
    var distance = 0
    var timeTaken = 0
    println("Enter the route of your choice:\n" +
            "1. Route 1\n" +
            "2. Route 2\n" +
            "3. Route 3\n" +
            "4. Route 4")
    val route = readln()
    if (route == "1") {
        distance = 5000
        timeTaken = distance/ speed
        println("You selected Route $route. You will reach the village in $timeTaken hours")
    } else if (route == "2") {
        distance = 25000
        timeTaken = distance / speed
        println("You selected Route $route. You will reach the village in $timeTaken hours")
    } else if (route == "3") {
        distance = 50000
        timeTaken = distance / speed
        println("You selected Route $route. You will reach the village in $timeTaken hours")
    } else if (route == "2") {
        distance = 10000
        timeTaken = distance / speed
        println("You selected Route $route. You will reach the village in $timeTaken hours")
    } else {
      println("Select routed")
    }

    // Using when
    println("Enter the route of your choice:\n" +
            "1. Route 1\n" +
            "2. Route 2\n" +
            "3. Route 3\n" +
            "4. Route 4")

    val option1 = 5000/speed
    val option2 = 25000/speed
    val option3 = 50000/speed
    val option4 = 10000/speed

    val routeWhen = readln()
    when (routeWhen) {
        "1" -> println("You selected Route $route. You will reach the village in $option1 hours")
        "2" -> println("You selected Route $route. You will reach the village in $option2 hours")
        "3" -> println("You selected Route $route. You will reach the village in $option3 hours")
        "4" -> println("You selected Route $route. You will reach the village in $option4 hours")
        else -> println("Select a route")
    }

}