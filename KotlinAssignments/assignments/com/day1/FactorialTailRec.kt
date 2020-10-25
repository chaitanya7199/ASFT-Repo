package com.day1

fun main(args: Array<String>) {
    var n = 26.toLong()
    var result = factorial(n)
    println("The factorial of $n is $result")
}

tailrec fun factorial(n: Long, semiresult: Long = 1): Long {
    return if(n <= 1) semiresult.toLong()
    else factorial((n-1), n * semiresult)
}