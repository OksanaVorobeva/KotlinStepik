package oop.lesson8

class Dog( weight: Float) : Animal("Собака", weight, "Суша") {
    override fun eat() {
        println("Кушаю кость")
    }


}