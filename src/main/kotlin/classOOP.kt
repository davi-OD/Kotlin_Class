//class className{ // class header
//    //property
//
//    //member function
//}


//class className constructor() { //class header
//    // property
//
//    // member function
//}

class Account {
    var acc_no: Int = 0
    var name:String? = null
    var amount:Float = 0f

    fun insert(ac:Int, n:String, am:Float) {
        acc_no = ac
        name= n
        amount = am
        println("Account no: ${acc_no} holder: ${name} amount: ${amount}")
    }

    fun deposit() {
        // deposit code
    }

    fun withdraw() {
        // withdraw code
    }

    fun checkBalance() {
        // balance check code
    }
}

// Primary constructor
class Car(var color:String, var model:String="Uganda") {
    var brand:String = "Benz"
    var year:String = ""
    var bond:String = model
    var hosePower:Int  = 0
    var engineSize:Float =  0.0f
    var clutch:Boolean ?= null
}

//Secondary constructor
class Automobile{
    var hosePower:Int = 0
    var engineSize:Float = 0.0f
    var clutch:String ?= null

    constructor()

    constructor(color: String, model: String) {
        this.clutch = super.toString()
        super.toString()
    }

    constructor(brand: String, year:String, bond:String)

    fun calculatePower():String {
        return "Power of a $engineSize car is 44Watt"
    }
}


// Inheritance
open class AppCompatActivity {
    open fun onCreate(savedInstanceBundle:String) {
        println("I'm in the oncreate method of AppCompatActivity")
    }
}

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceBundle: String) {
        super.onCreate(savedInstanceBundle)
        println("DFSadfewqeds")
    }
}


fun main() {
//    Account()
    var acc = Account()
    acc.insert(833232,"Davi",1000f )
    println("${acc.name}")

    val rangeRover = Car("")
    rangeRover.color = "Black"
    println(rangeRover.model)
    rangeRover.model = "Range Rover Velar"
    println(rangeRover.model)

    val tesla = Car("Black")
    tesla.clutch = false

//    More
    val rangeRovver = Automobile("Red", "Velar")
    val tesla1 = Automobile("Black","S-Plaid", "NK")
    rangeRover.engineSize = 23.9f

    val powr = rangeRovver.calculatePower()
    println(powr)

    val A = MainActivity()
    A.onCreate("Ths")
    print(A.onCreate("Ths"))

}