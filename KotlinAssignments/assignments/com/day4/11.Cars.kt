package com.day4

/*
Create a sealed class Cars add sub classes as Maruti, Hyndai,Honda, accept the type of car as console input
if the use enters
Maruti-> Output ->Indian make
Hyndai-> Output->Korean make
Honda-> Output-> Japan Make
Use When expression to display the output.
*/

import java.util.*

sealed class Cars {
    abstract fun company()
}

class Maruti: Cars() {
    override fun company() {
        println("Company is Maruti.")
    }
}

class Hyndai: Cars() {
    override fun company() {
        println("Company is Hyndai.")
    }
}

class Honda: Cars() {
    override fun company() {
        println("Company is Honda.")
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    println("Enter a company:")
    val company: String = sc.nextLine()
    val maruti = Maruti()
    val hyndai = Hyndai()
    val honda = Honda()
    if(company.trim().equals("Maruti", true))
        println(myFun(maruti))
    else if(company.trim().equals("Hyndai", true))
        println(myFun(hyndai))
    else if(company.trim().equals("Honda", true))
        println(myFun(honda))
    else
        println("Invalid input")
}

fun myFun(cars: Cars): String {
    return when(cars) {
        is Maruti -> "India Made"
        is Hyndai -> "Korea Made"
        is Honda -> "Japan Made"
    }
}