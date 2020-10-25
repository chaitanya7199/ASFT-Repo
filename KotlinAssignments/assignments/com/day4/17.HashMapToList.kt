package com.day4

/*
Write a kotlin program to convert Map(HashMap) to List
*/

fun main() {
    val hMap: HashMap<Any, Any> = HashMap<Any, Any>()
    hMap.put(1,"kotlin")
    hMap.put(2, 500)
    hMap.put("name", "Sai")

    val l = hMap.toList()
    println(l)

    /*
    //traversing the list
    println(l[0])         //(1, kotlin)
    println(l[0].second)  //kotlin
    */


    /*val list = listOf("sai" to "name")
    println(list)*/
}