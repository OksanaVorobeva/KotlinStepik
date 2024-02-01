package kot

fun main() {
    val names = mutableListOf<String>()
    val phone = mutableListOf<Long>()
    for (i in 0..1000) {
        names.add("Имя$i")
        phone.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }
    val users = names.zip(phone)
    for (user in users) {
        println("Имя: ${user.first} Телефон: ${user.second} ")
    }

    val fullNames = mutableListOf<String>()
    for (i in 0..1000) {
        fullNames.add("Имя$i Фамилия$i")
    }
    val names1 = fullNames.map { it.substringBefore(" ") }
    for (name in names1) {
        println(name)
    }
    val lastNames = fullNames.map { it.substringAfter(" ") }
    for (nameL in lastNames) {
        println(nameL)
    }

    val users1=names1.zip(lastNames)
    for (user in users1) {
        println(" ${user.first}  ${user.second} ")
    }

}