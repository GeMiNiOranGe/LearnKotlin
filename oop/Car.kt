package oop

open class Car(brand: String, model: String, year: Int = 0) {
    protected val tag: String = this::class.simpleName ?: "Unknown"

    var brand: String = brand
    var model: String = model
    var year: Int = year

    open fun properties(): List<Pair<String, Any>> =
        listOf(
            "Brand" to brand,
            "Model" to model,
            "Year" to year
        )

    override fun toString(): String {
        val props = properties()

        return tag + "\n" + props
            .mapIndexed { index, (key, value) ->
                val prefix = if (index == props.lastIndex) "\\--" else "+--"
                "$prefix $key: $value"
            }
            .joinToString("\n")
    }
}
