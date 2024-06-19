package lesson_5_3

const val NUMBER_ONE = 33
const val NUMBER_TWO = 24

fun main() {

    println("Введите ваши два числа по порядку от 0 до 42:")
    val userNumberOne = readln().toInt()
    val userNumberTwo = readln().toInt()

    if (userNumberOne == NUMBER_ONE || userNumberOne == NUMBER_TWO
        && userNumberTwo == NUMBER_TWO || userNumberTwo == NUMBER_ONE
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (userNumberOne == NUMBER_ONE || userNumberOne == NUMBER_TWO || userNumberTwo == NUMBER_TWO
        || userNumberTwo == NUMBER_ONE
    ) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")

    println("Для победы нужно было угадать числа: $NUMBER_ONE и $NUMBER_TWO")
}
