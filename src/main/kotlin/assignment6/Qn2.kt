package assignment6

fun main() {

    //2. assuming a group A contains elements {a, b, c, d, e , a, g, r, f}
    //group B contains {ant, bee, elephant, dog, cat}.
    // Create a map that links the two groups using their first characters
    val groupA = listOf("a", "b", "c", "d", "e" , "a", "g", "r", "f")
    val groupB = mutableListOf("ant", "bee", "elephant", "dog", "cat")


    val animalMap = mutableMapOf<String, String>()

    for (i in groupA) {
        for (j in groupB) {
            if (i.first() == j.first()) {
                animalMap[i] = j
            }
        }


    }
    animalMap.forEach {
        println(it)
    }


    //3. after implementing 2 above, add five entries that map five unique characters
    // to the respective animal name
    animalMap["r"] = "rat"
    animalMap.put("f","fox")
    animalMap.put("g","goat")

    println(animalMap)

//    groupB.add(5,"rat")
//    groupB.add(6,"fox")
//    println(groupB)
}


