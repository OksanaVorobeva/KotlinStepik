package oop.lesson14

fun main(){
    val db=DataBase
    db.insertData("1")
    db.insertData("2")
    val test=Test()
    test.insertTestData("3")
    test.insertTestData("4")

    for (str in db.data){
        println(str)
    }
}