package kot

fun main(){
    val sum:(Int,Int)->Int = {a,b->a+b}
    println(sum(2,10))

    val square:(Int)->Int={it*it}
    println(square(4))

    val perimeter:(Int,Int)->Int={a,b->(a+b)*2}
    println(perimeter(10,5))

    val sayHello:(String)->Unit={ println("Привет, $it") }
    println(sayHello("Андрей"))

    val sort:(Array<Int>)->Array<Int> = {
        for (i in it.size-2 downTo 0){
            for (j in 0..i){
                if (it[j]<it[j+1]){
                    val temp=it[j]
                    it[j]=it[j+1]
                    it[j+1]=temp
                }
            }
        }
        it
    }
    val sortedArray=sort(arrayOf(3,5,2))
    for (i in sortedArray){
        println(i)
    }
}

