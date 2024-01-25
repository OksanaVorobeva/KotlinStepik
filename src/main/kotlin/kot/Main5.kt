package kot

fun main(){
    println(sum("10","ddddd"))
}

fun sum(a:String,b:String):Int{
    val result=try {
        val numA=a.toInt()
        val numB=b.toInt()
        numA+numB
    }catch (e:Exception){
        0;
    }
    println(result)
    return result
}