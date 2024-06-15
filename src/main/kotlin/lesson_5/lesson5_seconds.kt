package org.example.lesson_5

    const val MINUTE_IN_HOUR = 60
    const val SECOND_IN_HOUR = 3600

fun main (){

    val mainSeconds = 6480
    val hours = mainSeconds / SECOND_IN_HOUR
    val minutes = (mainSeconds % SECOND_IN_HOUR) / MINUTE_IN_HOUR
    val seconds = mainSeconds % MINUTE_IN_HOUR
    val result = String.format("Проведенное время в космосе: %02d:%02d:%02d", hours, minutes, seconds)

    println(result)


}