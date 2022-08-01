
fun main() {
    var temprature = Temprature(12.2)
    println("The Temprature in celcius is ${temprature.celcius} and the temprature in feherenheit is ${temprature.fernhiet}")
    temprature.fernhiet = 32.3
    println("The Temprature in celcius is ${temprature.celcius} and the temprature in feherenheit is ${temprature.fernhiet}")


    var age = 18

    if (age > 18) {
        println("You are allowed to go inside")
    }
    else {
        println("You are not allowed to go inside")
    }
    var mylist = mutableListOf<String>("Dipika", "Cathy")
    for ( myvar in  mylist) {
        println(myvar)
    }
    var person = Person()

}

class Person {

    private var _name : String = ""

    var name : String
        get() {
            return  this._name
        }
        set(value) {
            this._name = value
        }
}



