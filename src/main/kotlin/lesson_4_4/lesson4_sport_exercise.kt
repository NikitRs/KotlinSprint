package lesson_4_4

fun main() {

    val trainingDay = 6
    val armTraining: Boolean
    val pressTraining: Boolean
    val legTraining: Boolean
    val backTraining: Boolean

    val evenDay = trainingDay % 2

    if (evenDay == 0) {
        armTraining = false
        pressTraining = false
        legTraining = true
        backTraining = true
    }
    else {
        armTraining = true
        pressTraining = true
        legTraining = false
        backTraining = false
    }

    println("""
        Упражнение для рук: $armTraining
        Упражнение для ног: $legTraining
        Упражнение для спины: $backTraining
        Упражнение для пресса: $pressTraining
    """.trimIndent())


}