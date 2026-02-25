package oop

class NegativeNumberException(
    parameter: String = "Parameter",
    cause: Throwable? = null
) : IllegalArgumentException("$parameter is less than zero.", cause)
