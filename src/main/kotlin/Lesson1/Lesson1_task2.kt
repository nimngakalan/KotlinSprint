package org.example

fun main(){

    // ДЗ. Урок 1, задание 2. Тема "Переменные"

    val numberOfOrders: Int  = 75
    val thanksForThePurchase: String = "Благодарим Вас за совершенную покупку! Было приятно иметь с Вами дело!!!"

    println("Колличество заказов: $numberOfOrders")
    println(thanksForThePurchase)

    var numberOfEmployees: Int = 2000
//    println("Общее колличество работников: $numberOfEmployees")

    numberOfEmployees -= 1
    println(numberOfEmployees)

}