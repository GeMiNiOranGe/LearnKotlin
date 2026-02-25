package oop

class SportsCar(
    brand: String,
    model: String,
    year: Int = 0,
    maxSpeed: Int = 0
) : Car(brand, model, year) {
    var maxSpeed: Int = maxSpeed
        get() = field
        set(value) {
            require(value >= 0) { "Max Speed must be >= 0" }
            field = value
        }

    override fun properties(): List<Pair<String, Any>> =
        super.properties() + ("Max Speed" to maxSpeed)
}