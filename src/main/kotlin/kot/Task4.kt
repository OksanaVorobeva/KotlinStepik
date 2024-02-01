package kot

fun main() {
    val array = (0..1000).toList()
    val employees = array.map { "Employee #$it" }
    val first30 = employees.dropLast(950)
    for (employee in first30) {
        println(employee)
    }

    val array1 = generateSequence(0) {
        println("${it + 2}")
        it + 2
    }
    val evenList = array1.take(10)
    for (i in evenList) {
        println(i)
    }

    val array2 = generateSequence("Сотрудник №1") {
        val index = it.substring(11).toInt()
        "Сотрудник №${index + 1}"
    }
    val listOfFirst100 = array2.take(100)
    for (employee in listOfFirst100) {
        println(employee)
    }
}