package com.day4

/*
Declare a String in Kotlin as nullable Types where it can accommodate null values.
Initialize the variable with “I like to study Kotlin” Check for the null condition.
If it is not null display the string in reverse order.
*/

fun main() {
    var str: String? = "I like to study Kotlin"
    if(str != null)
        println(str.reversed())
    else
        println("Null value")
}