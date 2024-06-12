package org.example.lesson_5

fun main (){

    val mainSeconds : Short = 6480
    val secondsInHour = 3600
    val minuteInHour = 60
    val hours = (mainSeconds / secondsInHour)
    val fullHours = hours
    val minute = (mainSeconds % secondsInHour)
    val fullMinutes = (minute / minuteInHour)
    val fullSeconds = (minute % minuteInHour)
    val result = String.format("Проведенное время в космосе: %02d:%02d:%02d", fullHours, fullMinutes, fullSeconds)

    println(result)


}