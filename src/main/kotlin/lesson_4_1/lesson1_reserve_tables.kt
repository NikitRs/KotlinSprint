package lesson_4_1

fun main () {

    val fullTables = 13
    val reserveTablesToday = 13
    val reserveTablesTomorrow = 9

    val reserveToday = reserveTablesToday < fullTables
    val reserveTomorrow = reserveTablesTomorrow < fullTables

    println("Доступность столиков на сегодня: $reserveToday \nДоступность столиков на завтра: $reserveTomorrow")

}