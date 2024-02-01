package oop.lesson3

fun main(){
    val cat=Cat("Барсик",5,3f)
    cat.printInfo()
    println(cat.isOld)

    val programmer= Worker("Ivan","Programmer",2016)
    println(programmer.printInfo())
}

fun  Worker.printInfo(){
    println("Имя:$name Должность:$position Год$startYear устройства: Стаж:$experience ")
}
