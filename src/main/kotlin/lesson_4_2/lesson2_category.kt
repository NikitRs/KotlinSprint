package lesson_4_2

fun main() {

    val weightOfGoods1 = 20
    val volumeOfGoods1 = 80
    val weightOfGoods2 = 50
    val volumeOfGoods2 = 100
    val minWeightOfAverage = 35
    val maxWeightOfAverage = 100
    val maxVolumeOfAverage = 100

    println("Груз с весом $weightOfGoods1 кг и объемом $volumeOfGoods1 л соотвествует категории 'Average': ${weightOfGoods1 > minWeightOfAverage && weightOfGoods1 <= maxWeightOfAverage && volumeOfGoods1 < maxVolumeOfAverage} ")
    println("Груз с весом $weightOfGoods2 кг и объемом $volumeOfGoods2 л соотвествует категории 'Average': ${weightOfGoods2 > minWeightOfAverage && weightOfGoods2 <= maxWeightOfAverage && volumeOfGoods2 < maxVolumeOfAverage} ")

}