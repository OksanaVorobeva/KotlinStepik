package kot

fun main() {
    println(max(5, 10))
    println(crop("wwwwwwkjd"))
    println(sum(1,2,3,4))
    val numbers= mutableListOf(3,6,1,8,0,4)
    val result= sort(2,3,6,9,2)
    for (i in result){
        println(i)
    }
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun crop(str:String)=str.substring(0,Math.min(5,str.length))

fun sum(vararg  numbers:Int):Int{
    var result=0
    for (num in numbers){
        result+=num
    }
    return result
}

fun sort(numbers: MutableList<Int>):List<Int>{
    for (i in 1 until numbers.size){
        for (j in numbers.size-1 downTo i){
            if (numbers[j]<numbers[j-1]){
                val temp=numbers[j]
                numbers[j]=numbers[j-1]
                numbers[j-1]=temp
            }
        }
    }
    return  numbers
}

fun sort(numbers: Array<Int>)= sort(numbers.toMutableList())
fun sort(vararg numbers: Int)= sort(numbers.toMutableList())