package kot

fun main(){
    val list= listOf<Int>()
    myWith(list){
        kot.sum()
        average()
    }

    val string="ffffff"
    myWith(string){
        uppercase()
    }
}

/*fun myWith(list:List<Int>,operation:List<Int>.()->Unit){
    list.operation()
}

fun myWith(string: String,operation:String.()->Unit){
    string.operation()
}

fun myWith(obj:Any,operation:Any.()->Unit){
    obj.operation()
}*/

inline fun <T,R> myWith(obj:T,operation:T.()->R):R{
    return obj.operation()
}