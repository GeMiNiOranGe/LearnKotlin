import basic.*

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
}
