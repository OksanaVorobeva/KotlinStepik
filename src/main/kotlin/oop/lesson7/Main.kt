package oop.lesson7

import oop.lesson7.Month.*
import oop.lesson7.Season.*


fun main() {
    val month = SEPTEMBER
    val season = when (month) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN

    }
    println(month.tempAverage)
    println(season)
}