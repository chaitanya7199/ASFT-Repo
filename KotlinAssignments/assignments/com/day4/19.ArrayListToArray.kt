package com.day4

/*
Write a kotlin program to convert ArrayList to Array
*/

fun main() {
    val arrList: ArrayList<Int> = ArrayList<Int>()
    arrList.add(100)
    arrList.add(50)
    arrList.add(27)
    arrList.add(4203)

    /*
    giving error:
    val array: Array<Int> = arrList.toArray()
    why?
    */

    val array = arrList.toArray()
    for(element in array)
        print("$element ")
}