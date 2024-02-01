package oop.lesson10.hw

fun main(){
    val sportsman=Sportsmen()
    sportsman.invokeWaterBoy(object :WaterBoy{
        override fun bringWater() {
            println("Вода принесена")
        }
    })

    sportsman.invokeWaterBoy { println("Вода принесена ") }
}