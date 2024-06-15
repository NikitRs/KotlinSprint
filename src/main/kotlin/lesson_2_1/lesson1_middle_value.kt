package lesson_2_1

fun main(){

    val children = 4
    val ratingOne = 3
    val ratingTwo = 4
    val ratingThree = 3
    val ratingFour = 5

    val middleValue = (ratingOne + ratingTwo + ratingThree + ratingFour).toDouble() / children
    val result = "Средний арифметический балл в классе равен: $middleValue"

    println(result)
}