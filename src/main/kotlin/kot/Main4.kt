package kot

fun main(){
    printInfo("Иванов","Иван")
    println(volume(10,20,30))

}

fun printInfo(lastname:String="",name:String="",patronymic:String=""){
    if (lastname.isNotEmpty()){
        println("Фамилия: $lastname")
    }
   if (name.isNotEmpty()){
       println("Имя: $name")
   }
    if (patronymic.isNotEmpty()){
        println("Отчество : $patronymic")
    }
}

/*
fun printInfo(lastname:String,name:String){
    printInfo(lastname,name,"")
}*/

fun volume(a:Int,b:Int=a,c:Int=a)=a*b*c