package classes_and_oop_assignment


//    Create a class color having attributes name, symbol and hex code and
//    a function that returns the three attributes as a string

open class Color{
    var name:String ?= null
    var symbol:String ?= null
    var hex_code:String ?= null
    open fun colorDets(n:String, sym:String,hx:String) {
        name = n
        symbol = sym
        hex_code = hx
       println("The color $name has a symbol $symbol and a hex code of $hex_code")
    }
}

//    Create a class rainbow that inherits from color and modifies the function in
//    class color to return all the colors of a rainbow and prints the output
class Rainbow : Color() {
    override fun colorDets(c1: String, c2: String, c3: String) {
        var c4 = "Yellow"
        var c5 = "Orange"
        var c6 = "Green"
        var c7 = "Blue"
        println("The colors of the rainbow are $c1, $c2, $c3, $c4, $c5, $c6, $c7")
    }
}

fun main() {
    var c1 = Color()
    c1.colorDets("white","WT","#fffffff")

    var r1 = Rainbow()
    r1.colorDets("Red","Violet", "Indigo")
}