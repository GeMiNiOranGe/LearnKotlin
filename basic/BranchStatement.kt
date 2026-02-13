package basic

fun toEvenOddString(number: Int): String {
    return if (number % 2 == 0) {
        "Even"
    } else {
        "Odd"
    }
}

fun toBmiString(weight: Double, height: Double): String {
    val bmi: Double = weight / (height * height)

    return when {
        bmi < 18.5 -> "Underweight"
        bmi < 24.9 -> "Normal weight"
        bmi < 29.9 -> "Overweight"
        bmi < 34.9 -> "Obesity"
        else -> "Extremely Obesity"
    }
}
