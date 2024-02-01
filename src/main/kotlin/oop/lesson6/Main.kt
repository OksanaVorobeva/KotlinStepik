package oop.lesson6

fun main(){
    val student1=Student("Иван","Иванов","412344")
    val student2=Student("Иван","Иванов","412344")
    val student3=student1.copy(id="234")

    /*val(name,lasName,id)=student1

    println(name)
    println(lasName)
    println(id)*/

    println(student1)
    println(student2)

    println(student1.hashCode())
    println(student2.hashCode())

    println(student1==student2)
    println(student1===student2)
}