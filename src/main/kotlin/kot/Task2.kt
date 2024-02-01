package kot

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }

    val listOfEvenNumber = listOfNumbers.filter { it % 2 == 0 }
    for (i in listOfEvenNumber) {
        println(i)
    }

    val names= listOf("Иван","Андрей","Алексей","Роман","Ирина")
    val namesStartsFromA=names.filter { it.startsWith("А") }
    for (i in namesStartsFromA){
        println(i)
    }
}