package basic

fun checkAge(age: Int): String =
    if (age >= 18) {
        "Adult"
    } else {
        "Minor"
    }

val getStringLength: (String) -> Int = { input ->
    input.length
}

fun numberTransformer(number: Int, transformer: (Int) -> Int, initValue: Int): Int {
    return transformer(number) + initValue
}

fun calculateLength(text: String, calculator: (String) -> Int): Int {
    return calculator(text)
}

fun findEven() {
    /*
    // Using a custom label to return from the lambda expression
    listOf(1, 3, 4, 6).forEach myForEachLabel@ {
        if (it % 2 != 0) {
            return@myForEachLabel
        }
        println("Found $it")
    }
    */

    listOf(1, 3, 4, 6).forEach {
        if (it % 2 != 0) {
            return@forEach
        }
        println("Found $it")
    }
}
