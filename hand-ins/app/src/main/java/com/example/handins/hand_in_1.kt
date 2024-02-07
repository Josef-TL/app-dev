package com.example.handins
import java.util.Scanner

fun main(){

   // checkAge()

    val numList: List<Int> = listOf(0,-12,4,6,123)
    println("Average of the list ${numList} is: " + calculateAverage(numList))


    val cpr: String = "3203139999"
    println("Is $cpr a valid CPR Number?")
    println(isCprValid(cpr))

}

/*********************
 * Opgave 1
 * A person is elligible to vote if his/her age is greater than or equal to 18.
 * Define a method to find out if he/she is elligible to vote
 *********************/

fun checkAge(){
    val reader = Scanner(System.`in`)

    println("Please enter age: ")
    val userAge: Int = reader.nextInt()

    if(userAge < 18) println("You cannot vote") else println("Vote NOW!")
}


/*********************
 * Opgave 2
 * Define two functions to print the maximum and the minimum number respectively among three numbers
 * Bruger jeg ikke bare maxOf her?
 *********************/

/*********************
 * Opgave 3
 * Write a Kotlin function named calculateAverage
 * that takes in a list of numbers and returns their average.
 *********************/

fun calculateAverage(l:List<Int>):Double{
    val listLeng: Double = l.size.toDouble()
    val listSum: Double = l.sumOf { it.toDouble() }

    return listSum/listLeng
}

/*
Write a method that returns if a user has input a valid CPR number.
A valid CPR number has:
 * 10 Digits.
 * The first 2 digits are not above 31.
 * The middle 2 digits are not above 12.
 * The method returns true if the CPR number is valid, false if it is not.

 Bruger RegEx. Bruger ChatGPT til at finde en Expression
 */

fun isCprValid(cprString: String):Boolean{
    val validationExpression = "^(0[1-9]|[12][0-9]|3[01])(0[1-9]|1[0-2])(\\d{2})\\d{4}\$".toRegex()

    return validationExpression.matches(cprString)
}

