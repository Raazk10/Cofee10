

import java.util.*

fun main(args: Array<String>) {
    // initial value
    val scanner = Scanner(System.`in`)
    val water = 400
    val milk = 540
    val coffee = 120
    val disCups = 9
    val money = 550

    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$coffee of coffee beans")
    println("$disCups of disposable cups")
    println("$money of money")

// what to do here
    println("Write action (buy, fill, take, remaining, exit): ")

    when (scanner.nextLine()) {
        "buy" -> {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
            val choose = scanner.next()
            when (choose) {
                "1" -> {
                    val nWater = water - 250
                    val nCoffee = coffee - 16
                    val nDiscups = disCups - 1
                    val nMoney = money + 4

                    println("The coffee machine has:")
                    println("$nWater of water")
                    println("$milk of milk")
                    println("$nCoffee of coffee beans")
                    println("$nDiscups of disposable cups")
                    println("$nMoney of money")
                }
                "2" -> {
                    val nWater = water - 350
                    val nMilk = milk - 75
                    val nCoffee = coffee - 20
                    val nDiscups = disCups - 1
                    val nMoney = money + 7

                    println("The coffee machine has:")
                    println("$nWater of water")
                    println("$nMilk of milk")
                    println("$nCoffee of coffee beans")
                    println("$nDiscups of disposable cups")
                    println("$nMoney of money")
                }
                "3" -> {
                    val nWater = water - 200
                    val nMilk = milk - 100
                    val nCoffee = coffee - 12
                    val nDiscups = disCups - 1
                    val nMoney = money + 6

                    println("The coffee machine has:")
                    println("$nWater of water")
                    println("$nMilk of milk")
                    println("$nCoffee of coffee beans")
                    println("$nDiscups of disposable cups")
                    println("$nMoney of money")


                }
            }
        }

        "fill" -> {
            print("Write how many ml of water do you want to add: ")
            val fillWater = scanner.nextInt()
            print("Write how many ml of milk do you want to add: ")
            val fillMilk = scanner.nextInt()
            print("Write how many grams of coffee beans do you want to add: ")
            val fillCoffee = scanner.nextInt()
            print("Write how many disposable cups of coffee do you want to add: ")
            val fillcup = scanner.nextInt()
            val nWater = water + fillWater
            val nMilk = milk + fillMilk
            val nCoffee = coffee + fillCoffee
            val nDiscups = disCups + fillcup

            // printing new value
            println("The coffee machine has:")
            println("$nWater of water")
            println("$nMilk of milk")
            println("$nCoffee of coffee beans")
            println("$nDiscups of disposable cups")
            println("$money of money")


        }
        "take"-> {
            println("I gave you $$money")
            println()
            val nMoney = 0
            println("The coffee machine has:")
            println("$water of water")
            println("$milk of milk")
            println("$coffee of coffee beans")
            println("$disCups of disposable cups")
            println("$nMoney of money")
        }
        else -> println("invalid")

    }

}

fun main() {
    TODO("Not yet implemented")
}






















