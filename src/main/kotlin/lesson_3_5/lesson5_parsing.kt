package lesson_3_5

fun main() {

    val progressUser = "D2-D4;0"

    val result = progressUser.split("-", ";")

    val ofChessCage = result[0]
    val inChessCage = result[1]
    val numberOfProgress = result[2]

    println("Ход был совершен и квадрата: $ofChessCage")
    println("Ход был совершен на квадрат: $inChessCage")
    println("Номер хода: $numberOfProgress")
}