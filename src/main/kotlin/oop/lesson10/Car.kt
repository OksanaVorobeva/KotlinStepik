package oop.lesson10

class Car(override var name:String="Машина"):Transport(name) {
    override fun drive() {
        println("Машина едет....")
    }

    fun startEngine():Boolean{
        println("Запускаю двигатель....")
        return true
    }
}