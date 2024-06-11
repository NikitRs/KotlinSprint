package org.example.lesson_5

fun main (){

    val mainSeconds : Short = 6480
    val hours = (mainSeconds / 3600f)
    val fullHours = hours.toInt()
    val minutes =  (hours - fullHours) * 60f
    val fullMinutes = minutes.toInt()
    val seconds = (minutes - fullMinutes) *60F
    val fullSeconds = seconds.toInt()

    print("Время проведенное в космосе составляет $fullHours:$fullMinutes:$fullSeconds")


}