package de.sinjeba.heads.first.kotlin

fun main() {
    val myCat = Cat("Fido", 70, "Mixed")
    myCat.miaow()
    myCat.weight = 75

    println("Weight in Kgs is ${myCat.weightInKgs}")

    myCat.weight = -2;
    println("Weight in Kgs is ${myCat.weight}")

    myCat.activities = arrayOf("Out", "Frisbee", "Ball")
    for (item in myCat.activities) {
        println("My cat enjoys $item")
    }

    var cats = arrayOf(
        Cat("Fido", 70, "Mixed"),
        Cat("Fido", 70, "Mixed")
    )

    cats[1].miaow()
    cats[1].weight = 15
    println("Weight for ${cats[1].name} is ${cats[1].weight}")

}

class Cat(
    val name: String,
    weight_param: Int,
    species_param: String
) {
    init {
        print("Cat $name has been created")
    }

    var activities = arrayOf("Mouse toy")
    val species = species_param.toUpperCase()

    init {
        println("The species is $species")
    }

    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    val weightInKgs: Double
        get() = weight / 2.2

    fun miaow() {
        println(if (weight < 20) "Miaou" else "miiiiooouu")
    }

}
