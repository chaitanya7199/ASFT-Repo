package com.day4

/*
Declare a class Student with rollno, studentName, City as properties of the class.
Store the values in immutable Map for 10 instances and
write a code to iterate the Map Object to display only the students from “Bangalore”
*/

data class Student(var rollNo: Int, var studentName: String, var city: String)

fun main() {
    val student1 = Student(100,	"John",	"Bangalore")
    val student2 = Student(101,	"Peter", "Chennai")
    val student3 = Student(102,	"Marks", "Mumbai")
    val student4 = Student(103,	"Ravi",	"Bangalore")
    val student5 = Student(104,	"Meera", "Mumbai")
    val student6 = Student(105,	"Usha",	"Chennai")
    val student7 = Student(106,	"Rekha", "Chennai")
    val student8 = Student(107,	"Sunil", "Bangalore")
    val student9 = Student(108,	"Tara",	"Chennai")
    val student10 = Student(109, "Sun",	"Mumbai")
    val student11 = Student(110, "Ramu", "Bangalore")
    val students: Map<Int, Student> = mapOf(student1.rollNo to student1, student2.rollNo to student2,
    student3.rollNo to student3, student4.rollNo to student4, student5.rollNo to student5, student6.rollNo to student6,
    student7.rollNo to student7, student8.rollNo to student8, student9.rollNo to student9, student10.rollNo to student10, student11.rollNo to student11)
    for(student in students) {
        if(student.value.city.equals("Bangalore"))
            println(student)
    }
}