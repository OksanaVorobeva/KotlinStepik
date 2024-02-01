package kot

fun main() {
    val numbers = (0..100).toList()
    val doubledNumbers = numbers.map { it * 2 }
    for (i in doubledNumbers) {
        println(i)
    }

    val employees = numbers.map { "Employee №$it" }
    for (i in employees) {
        println(i)
    }

    val array = arrayOf(8, 10, -6, 45, 51)
    val sortedArray = array.sorted()
    for (i in sortedArray) {
        println(i)
    }

    val initArray = mutableListOf<Int>()
    for (i in 0 until 1000) {
        initArray.add((Math.random() * 1000).toInt())
    }
    val result = initArray.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map { "$it" }
    for (i in result) {
        println(i)
    }
}