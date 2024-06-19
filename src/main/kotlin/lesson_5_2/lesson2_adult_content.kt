package lesson_5_2

const val ADULT_AGE = 18
const val YEAR_NOW = 2024

fun main() {

    println("Пожалуйста, введите вашу дату рождения:")
    val dateOfBirthday = readln().toInt()
    val userAge = YEAR_NOW - dateOfBirthday

    if (userAge >= ADULT_AGE) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Скрытый контент недоступен")
    }


}