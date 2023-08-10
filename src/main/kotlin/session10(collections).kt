fun main() {
//    //immutable list
//    val myList = listOf(1,4,6,7,9,"rest","trees")
//    val list = List<Int>(45) { 9 }
//
//    //mutable list
//    val mList = mutableListOf("4",5,9,"6")
//    mList.add(4,"tree")
//    mList.add(5,"tree5")
//    mList.add(6,"tree6")
//
//    val mList2 = MutableList<Int>(4){9}
////    mList2.add(7)
////    mList2.add(98)
////    mList2.forEach{
////        println(it)
////    }
//
//
////    //descending order
////    for (i in 9 downTo 2) {
////        mList2.add(i)
////    }
//
//    for (i in 0 .. 10) {
//        mList2.add(i)
//    }
//    for (x in mList2) {
//        println(x)
//    }
//
//    /// Sets
//    val set1 = setOf("3",8,"7","tree","3",9,"7","6","tree")
//    val set2:Set<Int> = setOf(4,6,7,8,)
//
//    set1.forEach {
//        println(it)
//    }
//    println("----------------------")
//    for (i in set1) {
//        println(i)
//    }
//
//    val mSet1 = mutableSetOf("ree", "tree", 4,6,4,"tree","ree")
//    val mSet2 : MutableSet<Int> = mutableSetOf(2,3,4)
//    mSet1.add("tree")
//    mSet1.add(5)


    /// Map
    val map1 = mapOf(1 to "one", 2 to "two", "3" to "three")
    for (i in map1) {
        println(i.key)
    }

    val mMap1 = mutableMapOf("1" to "one", 2 to "two", 3 to "three")
    mMap1[4] = "four"
    mMap1.put("1","3")
//    mMap1.values.add("r")
    mMap1.remove(3)
    mMap1.replace(3,"four")
    for (i in mMap1) {
        println(i)
    }


}