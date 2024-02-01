package kot

fun main() {
    val result = modifyString("Hello") { it.uppercase() }
    println(result)

    val list = (0..100).toList()
    listModify(list) {
        println(it.sum())
    }
    println(list.sum())
}

fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}

inline fun listModify(list: List<Int>, operator: (List<Int>) -> Unit) {
    return operator(list)
}
