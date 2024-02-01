package kot


var name: String? = "jjjjjjjj"
val list1: MutableList<Int>? = mutableListOf()
fun main() {
    name?.let {
        if (it.length > 5) {
            println(it)
        }
    }

    val list = mutableListOf<Int>()
    with(list) {
        for (i in 0..1000) {
            add((Math.random() * 100).toInt())
        }
        println(sum())
        println(average())
        println(min())
        println(max())
        println(first())
        println(last())
    }

    list1?.let {
        with(list1) {
            for (i in 0..1000) {
                add((Math.random() * 100).toInt())
            }
            val result = filter { it % 2 == 0 }.take(100)
            for (i in result) {
                println(i)
            }
        }
    }

}