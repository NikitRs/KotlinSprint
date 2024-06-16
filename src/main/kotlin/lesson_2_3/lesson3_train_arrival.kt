package lesson_2_3

const val MINUTE_IN_HOUR = 60

fun main() {

    val trainHourStart = 9
    val trainMinutesStart = 39
    val trainGeneralMinutesWay = 457


    val startTotalMinutes = trainHourStart * MINUTE_IN_HOUR + trainMinutesStart
    val arrivalTotalMinutes = startTotalMinutes + trainGeneralMinutesWay
    val trainHourArrival = arrivalTotalMinutes / MINUTE_IN_HOUR
    val trainMinutesArrival = arrivalTotalMinutes % MINUTE_IN_HOUR

    println("Поезд прибудет в %02d:%02d".format(trainHourArrival, trainMinutesArrival))
}
