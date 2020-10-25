package com.day4

/*
Create a calculator methods (add,sub.mul&div)  in companion object.
Made this methods available for other classes.
Demonstrate how we can invoke these methods from a given class.
*/

class CalculatorMethods {
    companion object {
        fun add(vararg numbers: Int) {
            var result = 0
            for(n in numbers)
                result += n
            println("The sum is $result")
        }
        fun sub(vararg numbers: Int) {
            var result = numbers[0]
            for(n in numbers.drop(1))
                result -= n
            println("The difference is $result")
        }
        fun mul(vararg numbers: Int) {
            var result = 1
            for(n in numbers)
                result *= n
            println("The multiplication gave $result")
        }
        fun div(vararg numbers: Int) {
            var result = 1f
            for(n in numbers)
                result = n/result
            println("The multiplication gave $result")
        }
    }
}
fun main() {
    CalculatorMethods.add(2, 3, 4, 5)
    CalculatorMethods.sub(10, 3, 2, 1)
    CalculatorMethods.mul(10, 2, 3)
    CalculatorMethods.div(8, 4)
}