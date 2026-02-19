package oop

class Car(brand: String, model: String, year: Int) {
    var brand: String = brand
    var model: String = model
    var year: Int = year

    fun getInfo(): String = "Brand: $brand, Model: $model, Year: $year"

    override fun toString(): String = getInfo()
}
