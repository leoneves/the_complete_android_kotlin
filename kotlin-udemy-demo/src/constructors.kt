
fun main(args:Array<String>) {
    val price = 200.0
    var car = Car(price)
    car.giveDiscont()
    println(car.price)
}

class Car(var price:Double) {
    fun giveDiscont() {
        price *= 0.9
    }
}