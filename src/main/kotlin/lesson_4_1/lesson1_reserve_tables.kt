package lesson_4_1

const val FULL_TABLES = 13

fun main () {

    val reserveTablesToday = 13
    val reserveTablesTomorrow = 9

    val reserveToday = reserveTablesToday < FULL_TABLES
    val reserveTomorrow = reserveTablesTomorrow < FULL_TABLES

    println("Доступность столиков на сегодня: $reserveToday \nДоступность столиков на завтра: $reserveTomorrow")

}