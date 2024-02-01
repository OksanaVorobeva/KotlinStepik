package oop.lesson1

class Dog {
    var name = " "
        get() = field.lowercase().capitalize()

    var age = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var weight = 0f
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}