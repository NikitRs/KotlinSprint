package lesson_4_5

fun main() {

    val minTeamOfShip = 55
    val maxTeamOfShip = 70
    val minBoxesOfFood = 50

    println("Поврежден ли корабль? (true или false): ")
    val damageShip: Boolean = readln().toBoolean()
    println("Введите текущий состав экипажа: ")
    val teamOfShip: Int = readln().toInt()
    println("Введите количество ящиков с провизией на борту: ")
    val boxesOfFood: Int = readln().toInt()
    println("Благоприятны ли условия? (true или false): ")
    val weather: Boolean = readln().toBoolean()

    if (damageShip != true) {
        println(
            "Корабль может отправится в долгосрочное плавание: " +
                    "${teamOfShip >= minTeamOfShip && teamOfShip <= maxTeamOfShip && boxesOfFood > minBoxesOfFood}"
        )
    } else {
        println(
            "Корабль может отправится в долгосрочное плавание: " +
                    "${teamOfShip == maxTeamOfShip && weather == true && boxesOfFood > minBoxesOfFood}"
        )
    }
}