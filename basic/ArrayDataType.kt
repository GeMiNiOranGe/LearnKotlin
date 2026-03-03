package basic

fun printArrays() {
    val mixedArray: Array<Any> = arrayOf(1, "two", 3.0, true)
    println("Mixed array            : ${mixedArray.contentToString()}")
    println()

    val intArray: IntArray = IntArray(5) { it * 2 }

    println("Int array              : ${intArray.contentToString()}")
    println()

    val numbers = arrayOf(3, 4, 1, 2, 5, 3, 4, 5)
    
    println("Numbers array          : ${numbers.contentToString()}")
    println("First number           : ${numbers[0]}")
    
    numbers[0] = 10
    println("Modified numbers array : ${numbers.contentToString()}")
    println("Array size             : ${numbers.size}")
    println("Sum of numbers         : ${numbers.sum()}")
    println("Average of numbers     : ${numbers.average()}")
    println("Max number             : ${numbers.maxOrNull()}")
    println("Min number             : ${numbers.minOrNull()}")
    println("Contains 3             : ${numbers.contains(3)}")
    println("Index of 4             : ${numbers.indexOf(4)}")
    println("Reversed numbers       : ${numbers.reversedArray().contentToString()}")
    println("Sorted numbers         : ${numbers.sortedArray().contentToString()}")
    println("Unique numbers         : ${numbers.toSet().toTypedArray().contentToString()}")
    println("Numbers as list        : ${numbers.toList()}")
    println("Numbers as set         : ${numbers.toSet()}")
    println("Numbers as string      : ${numbers.joinToString(", ")}")
    println()

    val fruits = arrayOf("apple", "banana", "cherry", "date", "fig")

    println("Fruits array           : ${fruits.contentToString()}")
    println("First fruit            : ${fruits[0]}")

    fruits[0] = "avocado"
    println("Modified fruits array  : ${fruits.contentToString()}")
    println("Array size             : ${fruits.size}")
    println("Contains 'banana'      : ${fruits.contains("banana")}")
    println("Index of 'cherry'      : ${fruits.indexOf("cherry")}")
    println("Reversed fruits        : ${fruits.reversedArray().contentToString()}")
    println("Sorted fruits          : ${fruits.sortedArray().contentToString()}")
    println("Unique fruits          : ${fruits.toSet().toTypedArray().contentToString()}")
    println("Fruits as list         : ${fruits.toList()}")
    println("Fruits as set          : ${fruits.toSet()}")
    println("Fruits as string       : ${fruits.joinToString(", ")}")
    println()
}