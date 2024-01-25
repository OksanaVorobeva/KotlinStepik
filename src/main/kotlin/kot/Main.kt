package kot


fun main() {
    /*    val a: String? = null
        val b: String = "44444"
        val c: String = ""
        val result = (a?.length ?: 0) + (b?.length ?: 0) + (c?.length ?: 0)
        println(result)*/

    //if

    /*    val a=50
        if (a<40){
            println("Меньше 40")
        }else if (a<60){
            println("Больше 40, но меньше 60")
        }else{
            println("Больше либо равно 60")
        }*/


    /* var count = 50
      val food=if (count > 500) {
          count-=500
          "Пицца"
     } else if (count > 300) {
          count-=300
          "Шаурму"
     } else {
          count-=30
          "Дошик"
     }
     println("Вы можите купить $food,$count")*/

    //when

    /*  val indexOfMonth = 3

      val season =  when (indexOfMonth) {
          12,1,2 -> {
             "Зима"
          }
          in 3..5 -> {
               "весна"
          }
          in 3..5 -> {
              "Лето"
          }

          in 9..11 -> {
               "Осень"
          }
          else -> {
             "Не найдено"
          }
      }
      println(season)*/

    /* val temp = 80
     val state = when {
         temp < 0 -> "Твердое"
         temp < 100 -> "Жидкое"
         else -> "Газообразное"

     }
     println(state)*/

   /* val time = 23
    val weatherIsGood = true
    val result = when {
        time in 6..22 && weatherIsGood -> "Гулять"
        time in 6..22 && !weatherIsGood -> "Читать книгу"
        else -> "Спать"
    }
    println(result)*/

}