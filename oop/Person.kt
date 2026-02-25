package oop

open class Person {
    protected val tag: String = this::class.simpleName ?: "Unknown"

    var name: String

    var age: Int = 0
        get() = field
        set(value) {
            if (value < 0) {
                throw NegativeNumberException("Age")
            }
            field = value
        }

    var height: Double = 0.0
        get() = field
        set(value) {
            if (value < 0.0) {
                throw NegativeNumberException("Height")
            }
            field = value
        }

    constructor(name: String = "", age: Int = 0, height: Double = 0.0) {
        this.name = name
        this.age = age
        this.height = height
    }

    open fun getInfo(): String = """
        $tag (tag)
        - Name: $name
        - Age: $age
        - Height: $height
        """.trimIndent()

    override fun toString(): String = getInfo()
}
