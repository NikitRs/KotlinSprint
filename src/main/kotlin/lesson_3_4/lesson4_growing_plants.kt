package lesson_3_4

fun main() {

    val favorableConditionsWeather = "солнечная"
    val favorableConditionsOpenTent = true
    val favorableConditionsHumidityAir = 20
    val favorableConditionsSeason = "не зима"

    val nowConditionsWeather = "солнечная"
    val nowConditionsOpenTent = true
    val nowConditionsHumidityAir = 20
    val nowConditionsSeason = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${nowConditionsWeather == favorableConditionsWeather && nowConditionsOpenTent == favorableConditionsOpenTent && nowConditionsHumidityAir == favorableConditionsHumidityAir && nowConditionsSeason == favorableConditionsSeason} ")

}