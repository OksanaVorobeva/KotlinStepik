package oop.lesson9


class Programmer(name: String, age: Int,val language:String) : Worker(name, age),Cleaner {
    override fun clean() {
       println("Програмист убирае")
    }

    override fun work() {
        println("Пишу код на $language")
    }
}