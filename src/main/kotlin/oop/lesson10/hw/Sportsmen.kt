package oop.lesson10.hw

class Sportsmen {
    fun invokeWaterBoy(waterBoy: WaterBoy){
        waterBoy.bringWater()
    }

    inline fun invokeWaterBoy(bringWater:()->Unit){
        bringWater()
    }
}