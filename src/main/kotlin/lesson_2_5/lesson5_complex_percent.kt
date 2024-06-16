package lesson_2_5

import kotlin.math.pow

const val PERCENT_DIVISOR = 100

fun main(){

    val years = 20
    val moneys = 70_000
    val timesCompounded = 1
    val percent = 16.7 / PERCENT_DIVISOR

    val endSum = moneys * (1 + percent / timesCompounded).pow(timesCompounded * years)

    print("Через $years лет ваш вклад будет составлять: %.3f".format(endSum))
}