package com.day3

/*
 Using TailRec compute factorial of the given number.Keep the number as < 50
*/

import java.math.BigInteger

fun main(args : Array<String>){
    print("Enter the number: ")
    var number = BigInteger("50")
    var result = factorial(number,BigInteger.ONE)
    println("The factorial of $number is $result.")
}

tailrec fun factorial(number : BigInteger, semiResult : BigInteger) : BigInteger {
    return if(number == BigInteger.ZERO) semiResult
    else
        factorial(number - BigInteger.ONE, number * semiResult)
}
