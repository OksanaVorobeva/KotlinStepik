package oop.lesson8

class Programmer(name: String, age: Int,val language:String) : Worker(name, age) {
    override fun work() {
        println("Пишу код на $language")
    }
}