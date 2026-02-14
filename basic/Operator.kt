package basic

fun getMessageOrDefault(message: String? = null): String {
    return message?.uppercase() ?: "Unknown"
}
