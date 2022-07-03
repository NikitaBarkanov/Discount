package ru.netology

fun main() {

    println("Введите сумму покупки: ")
    val input = readLine()
    val purchasingSum = input?.toInt()
    val volumeDiscount = 0.05
    val regularDiscount = 0.01
    val standartDiscount = 100

    println("Если клиент пользуется картой лояльности, введите - да, в противном случае - нет")
    val userAnswer = readLine()

    var endPrice: Int
    if (userAnswer == "да") {
        if (purchasingSum != null) {
            if (purchasingSum > 0 && purchasingSum <= 1000) {
                endPrice = purchasingSum - (purchasingSum * regularDiscount).toInt()
                println(endPrice)
            } else if (purchasingSum > 1000 && purchasingSum <= 10000) {
                endPrice = purchasingSum - (purchasingSum - standartDiscount) - ((purchasingSum - standartDiscount) * regularDiscount).toInt()
                println(endPrice)
            } else if (purchasingSum > 10000) {
                endPrice = purchasingSum - (purchasingSum * volumeDiscount).toInt() -((purchasingSum * volumeDiscount) * regularDiscount).toInt()
                println(endPrice)
            }
        }
    } else {
        if (purchasingSum!! > 0 && purchasingSum <= 1000) {
           endPrice = purchasingSum
            println(endPrice)
        } else if (purchasingSum > 1000 && purchasingSum <= 10000) {
                endPrice = purchasingSum - standartDiscount
                println(endPrice)
        } else if (purchasingSum > 10000){ endPrice = purchasingSum - (purchasingSum * volumeDiscount).toInt()
            println(endPrice)}
    }

}