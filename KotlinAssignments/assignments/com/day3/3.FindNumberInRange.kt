package com.day3

/*
Declare a float range from 45.5 to 100.5
1. check whether the value 64.5 is present in the range,
2. if it is available then display the output
3. Reverse the range and display the output for every alternate number
*/

fun main() {
    var r = 45.5..100.5
    if(64.5 in r)
        println("Yes, 64.5 is in the range $r")
    else
        println("No, 64.5 is not in the range $r")

    var r2 = 101 downTo 46 step 2
    for(i in r2) {
        print("${i-0.5} ")
    }

}