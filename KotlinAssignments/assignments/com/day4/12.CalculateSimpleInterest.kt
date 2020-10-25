package com.day4

/*
Create an extension function to find the Simple Interest of the given principle amount.
Add this extension function to built in interface MutableMap.
*/

import java.util.*

data class SimpleInterest(var principal: Float, var time: Float, var rate: Float)

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter the principal: ")
    val principal = sc.nextFloat()
    print("Enter the time in years: ")
    val time = sc.nextFloat()
    print("Enter the rate of interest: ")
    val rate = sc.nextFloat()
    val si = SimpleInterest(principal, time, rate)
    val key: String = "SimpleInterest"
    val simpleInterest: MutableMap<String, SimpleInterest> = mutableMapOf()
    simpleInterest.put(key, si)
    println("\nThe simple interest for $principal at $rate% in $time years is ${simpleInterest.calculateSimpleInterest()}")
}

fun MutableMap<String, SimpleInterest>.calculateSimpleInterest(): Float {
    var interest = 0f
    for(simpleInterest in this)
        interest = simpleInterest.value.principal * simpleInterest.value.time * simpleInterest.value.rate

    return interest/100
}