package lesson_2_4

fun main(){

    val cristalMineral = 7
    val ironMineral = 11
    val buffPercent = 20
    val fullPercent = 100f
    val buff = buffPercent / fullPercent

    val buffCristalMineral = (cristalMineral * buff).toInt()
    val buffCIronMineral = (ironMineral * buff).toInt()

    println("При добыче кристаллической руды вы получили бонус: +$buffCristalMineral")
    println("При добыче железной руды вы получили бонус: +$buffCIronMineral")
}