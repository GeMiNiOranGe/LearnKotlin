package oop

class Student : Person {
    var grade: Int = 0
        get() = field
        set(value) {
            if (value < 0) {
                throw NegativeNumberException("Grade")
            }
            field = value
        }

    constructor(
        name: String = "",
        age: Int = 0,
        height: Double = 0.0,
        grade: Int = 0
    ) : super(name, age, height) {
        this.grade = grade
    }

    override fun getInfo(): String = super.getInfo() + "\n- Grade: $grade"
}