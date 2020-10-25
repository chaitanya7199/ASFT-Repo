package com.day2

fun main(args: Array<String>) {
    val myLambda = {name: String -> println("Welcome to kotlin Mr.$name")}
    display("Sai", myLambda)
}

fun display(name: String, myLambda: (String) -> Unit) {
    myLambda(name)
}
