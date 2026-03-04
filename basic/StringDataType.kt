package basic

fun printStrings(): Unit {
    val message: String = "      Hello everyone! I am Mike.     "
    println("Message                    : '$message'")

    println("First character            : '${message[0]}'")
    print("Each character             : '")
    message.forEach { char ->
        print(" $char")
    }
    println("'")
    println("Length                     : '${message.length}'")
    println("Uppercase                  : '${message.uppercase()}'")
    println("Lowercase                  : '${message.lowercase()}'")
    println("Contains 'Mike'            : '${message.contains("Mike")}'")
    println("Substring (0..4)           : '${message.substring(0..4)}'")
    println("Split by space             : '${message.split(" ")}'")
    println("Replace 'Mike' with 'Alice': '${message.replace("Mike", "Alice")}'")
    println("Trimmed                    : '${message.trim()}'")
    println("Trimmed start              : '${message.trimStart()}'")
    println("Trimmed end                : '${message.trimEnd()}'")
    println("Is blank                   : '${message.isBlank()}'")
    println("Is empty                   : '${message.isEmpty()}'")
    println("Reversed                   : '${message.reversed()}'")
    println("Repeated 3 times           : '${message.repeat(3)}'")
    println()
    
    val stringBuilder = StringBuilder(message.trim())
    stringBuilder.append(" Welcome")
    stringBuilder.append(" to")
    stringBuilder.append(" Kotlin")
    stringBuilder.append(" programming!")
    println("Using StringBuilder         : '${stringBuilder.toString()}'")
}
