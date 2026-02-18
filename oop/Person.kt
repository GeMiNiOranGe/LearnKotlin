package oop

class Person {
    var name: String = ""

    var age: Int = 0
        get() = field
        set(value) {
            if (value >= 0) {
                // TODO: Create a custom exeption
                field = value
            }
        }

    var height: Double = 0.0
        get() = field
        set(value) {
            if (value >= 0.0) {
                field = value
            }
        }

    constructor(name: String, age: Int, height: Double) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun getInfo(): String = "Name: $name, Age: $age, Height: $height"

    override fun toString(): String = getInfo()
}
