package kot

fun main(){
    val revenueByWeek = listOf(){
        listOf(5,6,3,7,4)
        listOf(4,8,9,3,2)
        listOf(4,3,7,6,5)
        listOf(9,4,2,3,5)
    }
 /*   val total= mutableListOf<Int>()
    revenueByWeek.map {
        for (i in it()){
            total.add(i)
        }
    }*/

    val total=revenueByWeek.flatMap { it() }
    val  average =total.average()
    println(average)

    val date = mapOf(
        "file1" to  listOf(2,5,4,3),
        "file2" to  listOf(4,5,6,7),
        "file3" to  listOf(4,6,7,8)
            )

    val date1 = mapOf(
        Pair("file1",listOf(2,5,4,3)),
        Pair("file2",listOf(4,5,6,7)),
        Pair("file3",listOf(4,6,7,8))
    )

    val average1= date1.flatMap { it.value }.average()
    println(average1)

    val date2 = mapOf(
        Pair("file1",listOf(2,5,4,3)),
        Pair("file2",listOf(4,-5,6,7)),
        Pair("file3",listOf(4,6,7,8))
    )

    val average3= date2.filter { it.value.all { it>=0 } }.flatMap { it.value }.average()
    println(average3)

    val average4= date2.filterNot { it.value.any() { it<0 } }.flatMap { it.value }.average()
    println(average4)

}
