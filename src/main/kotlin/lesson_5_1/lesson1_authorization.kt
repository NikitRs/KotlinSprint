package lesson_5_1

fun main() {

    val valueOne = 2
    val valueTwo = 6
    val sum = valueOne + valueTwo
    println("Введите результат примера \"$valueOne + $valueTwo\"")
    val result = readln().toInt()

    when (result) {
        sum -> println("Добро пожаловать!")
        else -> println("Доступ запрещен")
    }

}