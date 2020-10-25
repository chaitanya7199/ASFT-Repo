package com.day4

/*
Write a kotlin program to join two Lists
*/

fun main() {
    val list1: ArrayList<Any> = ArrayList<Any>()
    list1.add("kotlin")
    list1.add("java")
    list1.add("c++")
    list1.add("python")
    println("List1:\n${list1}")

    val list2: ArrayList<Int> = ArrayList<Int>()
    list2.add(1)
    list2.add(200)
    list2.add(5000)
    list2.add(7)
    println("\nList2:\n${list2}")

    list1.addAll(list2)
    println("\nList1 after adding all elements of List2:\n${list1}")
}