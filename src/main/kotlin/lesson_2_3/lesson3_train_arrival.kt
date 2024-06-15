package lesson_2_3

const val MINUTE_IN_HOUR = 60

fun main (){

    val trainHourStart = 9
    val trainMinutesStart = 39
    val trainGeneralMinutesWay = 457

    val trainHourWay = (trainGeneralMinutesWay / MINUTE_IN_HOUR)
    val trainMinutesWay = (trainGeneralMinutesWay % MINUTE_IN_HOUR)

    var trainHourArrival = trainHourStart + trainHourWay
    var trainMinutesArrival = trainMinutesStart + trainMinutesWay

    if (trainMinutesArrival >= 60){
        trainMinutesArrival -= 60
        trainHourArrival++
    }

    println("Поезд прибудет в %02d:%02d".format(trainHourArrival, trainMinutesArrival))
}