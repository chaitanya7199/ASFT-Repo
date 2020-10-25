package com.day4

/*
Create a list as follows:
stringList, mixedList, intList to accept some data and
write a kotlin fun using generics to display the value of each list.
*/

fun main() {
    var listOfStrings: MutableList<String> = mutableListOf<String>("Hi,", "Kotlin", "is", "interesting")
    var miscellaneousList: MutableList<Any> = mutableListOf<Any>("Sai", 100, true, 89.7, 'e')
    var integerList: MutableList<Int> = mutableListOf<Int>(1, 200, 500, -5)

    println("Displaying a list of strings:")
    displayListOfStrings(listOfStrings)

    println("Displaying a list of miscellaneous elements:")
    displayListOfStrings(miscellaneousList)

    println("Displaying a list of integers:")
    displayListOfStrings(integerList)
}

fun<T> displayListOfStrings(list: MutableList<T>) {
    for(item in list)
        print("$item ")
    println("\n")
}
