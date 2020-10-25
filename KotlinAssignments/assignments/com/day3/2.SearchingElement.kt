package com.day3

/*
Search for the given element in the Array using functions
*/

fun main() {
    var strArray = arrayOf("I", "am", "sai","learning","kotlin")
    println(searchElement(strArray, "kotlin"))
}

fun searchElement(sArr: Array<String>, str: String): String {
    //kotlin built-in function :
    // 1. find({it.contains("...")})
    // 2. find({it.startsWith("...")})
    return if(sArr.find( {it.contains("kotlin")}) != null)
                   "Element Found"
           else
                   "Not Found"
}