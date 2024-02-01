package oop.lesson10

fun main() {
    /*val car: Transport = Car()
    val bicycle: Transport = Basical()

    if (car !is Car) return
    car.name = "Машина2"

    if (car is Car) {
        car.name = "Машина2"
    }

    if (car is Car && car.startEngine())
        if (car !is Car || car.startEngine())*/

    travel(object :Transport("Автобус"){
        override fun drive() {
            println("Автобус едет")
        }
    })


}

fun travel(transport: Transport) {
    transport.drive()
}