package com.day3

/*
Using Lambda function calculate the Simple Interest(p*t*r/100)
*/

fun main() {
    val principle: Float = 285000f
    val rate: Float = 13f
    val time: Int = 5
    val simpleInterest: (Float, Float, Int) -> Float = { p, r, t -> p * r * t/100 }
    println("The simple interest is ${simpleInterest(principle, rate, time)}")
}