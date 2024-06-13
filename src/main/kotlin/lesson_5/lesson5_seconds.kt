package org.example.lesson_5

fun main (){

    val mainSeconds = 6480
    val secondsInHour = 3600
    val minuteInHour = 60
    val hours = mainSeconds / secondsInHour
    val minutes = (mainSeconds % secondsInHour) / minuteInHour
    val seconds = mainSeconds % minuteInHour
    val result = String.format("Проведенное время в космосе: %02d:%02d:%02d", hours, minutes, seconds)

    println(result)


}