package com.day3

/*
Declare a dynamic array it contains ANY type of data and iterate the array values using for loop.
 */

fun main() {
    val list: MutableList<Any> = mutableListOf<Any>("sai", 100, true, 65.7, 'a')
    list.add("kotlin")
    for(index in list.indices)
        println(list[index])
}