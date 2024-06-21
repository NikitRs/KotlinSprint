package lesson_3_1

fun main(){

    var greeting = ""
    val name = "Никита"
    val day = true

    if (day == true){
        greeting = "Добрый день!"
    }
    else{
        greeting = "Добрый вечер!"
    }

    println("$greeting $name.")

}