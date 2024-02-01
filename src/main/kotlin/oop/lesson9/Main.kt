package oop.lesson9

fun main(){
    val workers = mutableListOf<Worker>()
    workers.add(Seller("Leonid", 27))
    workers.add(Seller("Ivan", 30))
    workers.add(Seller("Sergey", 23))
    workers.add(Programmer("Max", 34, "Java"))
    workers.add(Programmer("John", 18, "Kotlin"))
    workers.add(Director("Nik", 50))


    for (worker in workers){
        if (worker is Programmer){
            println(worker.language)
        }
        worker.work()
        if (worker is Cleaner){
            worker.clean()
        }

        val cleaners=workers.filter { it is Cleaner }.map { it as Cleaner }
        for (c in cleaners){
            c.clean()
        }
    }
}