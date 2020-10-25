package com.day3

/*
 Count Vowels in the String using functions
*/

fun main(args: Array<String>) {
    println("Type a sentence: ")
    var str: String? = readLine()
    println("No. of vowels in given string is "+ countVowels(str))
}

fun countVowels(s: String?) : Int {
    var count: Int = 0
    if(s != null) {
        for(c in s) {
            if(c.equals('a', true)||c.equals('e', true)||c.equals('i', true)||
                    c.equals('o', true)||c.equals('u', true))
                ++count
        }
    }
    return count
}