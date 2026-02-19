import basic.*
import oop.*

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println("The first argument: ${args[0]}\n")
    }

    val message: String = "Hello world!"
    println(message)
    printRepeated("$message ", 5)
    printTriangleRepeated(3, 2)
    printOddNumbersUpTo(10)
    printArray(arrayOf(1, 2, 3, 4, 5))

    println("==================================================")

    println(toEvenOddString(7))
    println(toBmiString(70.0, 1.75))

    println("==================================================")

    println(getMessageOrDefault())

    println("==================================================")

    println(checkAge(16))
    println(getStringLength(message))
    println(numberTransformer(10, { number -> number * 2}, 3))
    println(calculateLength(message, {
        it.length
    }))
    println(calculateLength(message) {
        it.length
    })

    println("==================================================")

    val person = Person("Alice", 30, 1.65)
    println(person.toString())
    person.age = -35
    println(person.toString())

    val car = Car("Toyota", "DS-152", 2000)
    println(car.toString())
}
