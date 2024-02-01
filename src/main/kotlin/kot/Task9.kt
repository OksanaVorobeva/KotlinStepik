package kot

fun main() {
    val age = 5
   /* if (isAgeValid(age)) {
        println("Valid")
    }
    if (isAgeValid(age)) {
        println("Valid too")
    }
    if (isAgeValid(age)) {
        println("Valid too 2")
    }

    if (age.isAgeValid()) {
        println("Valid")
    }
    if (age.isAgeValid()) {
        println("Valid too")
    }
    if (age.isAgeValid()) {
        println("Valid too 2")
    }*/

    println(age.isPositive())

    val name = " "
    if (name.isNotEmpty()) {
        println(name)
    }

}

/*
fun isAgeValid(age: Int) = age in 6..100

fun Int.isAgeValid() = this in 6..100
*/

fun Int.isPositive() = this >= 0

fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}

