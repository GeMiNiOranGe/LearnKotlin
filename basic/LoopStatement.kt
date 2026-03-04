package basic

fun printRepeated(message: String, times: Int): Unit {
    repeat(times) {
        print(message)
    }

    println()
}

fun printTriangleRepeated(height: Int, times: Int): Unit {
    /*
    // Don't support syntax reverse like this:
    for (i in 5..1) {
        println(i)
    }
    */

    var remainingRepeats: Int = times

    while (remainingRepeats > 0) {
        for (i in 1..height) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
        
        for (i in height - 1 downTo 2) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }

        remainingRepeats--
    }

    println("*")
}

fun printOddNumbersUpTo(number: Int): Unit {
    for (i in 1..number step 2) {
        print("$i ")
    }
    println()
}

fun printArray(numbers: Array<Int>): Unit {
    for (i in 0 until numbers.size) {
        print("${numbers[i]} ")
    }
    println()
}

fun printFirstDivisible(matrix: List<List<Int>>, divisor: Int): Unit {
    if (divisor == 0) {
        throw IllegalArgumentException("Divisor must not be 0")
    }

    search@ for (row in matrix) {
        for (value in row) {
            if (value % divisor == 0) {
                println("Found: $value")
                break@search
            }
        }
    }
}