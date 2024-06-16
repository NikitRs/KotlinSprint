package lesson_3_4

fun main(){
    var ofChessCage = "E2"
    var inChessCage = "E4"
    var numberOfProgress = 1

    print("Ход черных:")
    println(" [$ofChessCage-$inChessCage;$numberOfProgress]")

    ofChessCage = "D2"
    inChessCage = "D4"
    numberOfProgress = 1

    print("Ход белых:")
    println(" [$ofChessCage-$inChessCage;$numberOfProgress]")
}