package com.day3

/*
Accept the age and weight of a person from console input,
check whether the person is eligible to donate blood.
If his age>18 and weight>55 he is eligible to donate blood.
*/

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter person age : ")
    val age: Int = sc.nextInt()
    print("Enter person weight : ")
    val weight: Int = sc.nextInt()
    println("${if (age>18 && weight>55) "Eligible for blood donation" 
               else "Not Eligible for blood donation"}")
}