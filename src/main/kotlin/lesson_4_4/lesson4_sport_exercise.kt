package lesson_4_4

fun main() {

    val trainingDay = 6
    val evenDay = trainingDay % 2 == 0
    val armTraining: Boolean = !evenDay
    val pressTraining: Boolean = !evenDay
    val legTraining: Boolean = evenDay
    val backTraining: Boolean = evenDay

    println(
        """
        Упражнение для рук: $armTraining
        Упражнение для ног: $legTraining
        Упражнение для спины: $backTraining
        Упражнение для пресса: $pressTraining
    """.trimIndent()
    )


}