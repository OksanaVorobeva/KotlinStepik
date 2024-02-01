package oop.lesson3

class Cat(val name:String,val age:Int,val weight:Float=0f) {

    val isOld:Boolean
        get() = age>=12


    fun printInfo(){
        println("Кличка:$name  Возраст:$age  Вес:$weight")
    }

}


/*
fun Cat.isOld()=age>=12*/
