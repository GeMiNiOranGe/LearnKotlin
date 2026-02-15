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
