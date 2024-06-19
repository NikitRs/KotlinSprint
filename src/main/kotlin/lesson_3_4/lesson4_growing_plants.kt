package lesson_3_4

const val IS_SUNNY = "солнечная"
const val IS_AWNING_OPEN = true
const val HAS_HUMIDITY_AIR = 20
const val HAS_SEASON = "не зима"

fun main() {

    val isSunnyNow = "солнечная"
    val isAwningOpenNow = true
    val hasHumidityAirNow = 20
    val hasSeasonNow = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunnyNow == IS_SUNNY && isAwningOpenNow == IS_AWNING_OPEN && hasHumidityAirNow == HAS_HUMIDITY_AIR && hasSeasonNow == HAS_SEASON} ")

}