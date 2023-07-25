package assignment2
fun main() {
    /**
    3. A person has 4 options of choosing between:
    pizza, chicken,pancakes and cake
    if they choose pizza, they will go to pizza hut, if chicken, they
    go to kfc, if pancakes they go to FoodHub, if they choose cake,
    they go to Cakey. Write a program using If-else statement to capture
    a person's choice and print selected restaurants.
    Write the same program using a when
     */
//     Using if statements
    println("Enter your food choice:")
    var userChoice = readln()

    if (userChoice == "pizza") {
        println("You have selected $userChoice")
        println("You should go to Pizza hut")
    } else if (userChoice == "chicken") {
        println("You have selected $userChoice")
        println("You should go to KFC")
    } else if (userChoice == "pancakes") {
        println("You have selected $userChoice")
        println("You should go to FoodHub")
    } else if (userChoice == "cake") {
        println("You have selected $userChoice")
        println("You should go to Cakey")
    } else {
        println("Make your selection")
    }

// Using when
    println("Enter your food choice:")
    var userChoiceWhen = readln()

    when (userChoiceWhen) {
        "pizza" -> print("You selected $userChoiceWhen. Go to Pizza Hut")
        "chicken" -> print("You selected $userChoiceWhen. Go to KFC")
        "pancakes" -> print("You selected $userChoiceWhen. Go to FoodHub")
        "cake" -> print("You selected $userChoiceWhen. Go to Cakey")
        else -> println("Make you selection")
    }
}