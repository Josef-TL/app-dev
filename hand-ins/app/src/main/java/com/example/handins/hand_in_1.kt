package com.example.handins
import java.util.Scanner

fun main(){

   checkAge()

    val max : Int = getMax(1,18,8);
    val min : Int = getMin(1,18,-8);
    println(max); //18
    println(min); //-8

    val numList: List<Int> = listOf(0,-12,4,6,123)
    println("Average of the list ${numList} is: " + calculateAverage(numList))


    val cpr: String = "3203139999"
    println("Is $cpr a valid CPR Number?")
    println(isCprValid(cpr))

    fizzBuzz()

    abbrevName("Hello Wolrd Test")

    val testStringList: List<String> = listOf("Hello", "banana", "elephant", "pizza", "computer", "mountain", "butterfly", "galaxy", "happiness", "freedom")
    filterWordsByLength(testStringList,3)

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
 * Define two functions to print the maximum and the minimum number respectively
 * among three numbers
 *********************/
fun getMax(a:Int,b:Int,c:Int):Int{
    return maxOf(a,b,c)
}

fun getMin(a:Int,b:Int,c:Int):Int{
    return minOf(a,b,c)
}



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
Opgave 4

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


/*
 Opgave 5

 Write a program that prints the numbers from 1 to 100.
 But for multiples of three print “Fizz” instead of the number
 and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.
 */

fun fizzBuzz(){
    for (l in 1..100){
        if(l%3 == 0 && l%5 != 0){
            println("Fizz")
        } else if(l%3!=0 && l%5 == 0){
            println("Buzz")
        } else if(l%3==0 && l%5==0){
            println("FizzBuzz")
        }
        else{ println(l) }
    }
}

/*
Opgave 6

Write a program that takes your full name as input and displays
the abbreviations of the first and middle names except the last name which is displayed as it is.
For example, if your name is Robert Brett Roser, then the output should be R.B. Roser.
Or Benjamin Dalsgaard Hughes will be B.D. Hughes

 */

fun abbrevName(name:String){
    val nameArr = name.split(" ")
    val returnArr = nameArr.mapIndexed { index, s ->
            if(index == nameArr.lastIndex) s else s[0]
    }

    println(returnArr.joinToString(separator = ". "))
}


/*
Opgave 7

Write a program that takes a numerical grade (0-100) as input
and prints out the corresponding american letter grade.

Implement a function calculateGrade that takes an integer parameter representing the grade
and returns a string representing the letter grade according to the following scale:

90-100: "A"
80-89: "B"
70-79: "C"
60-69: "D"
Below 60: "F"

 */

fun calculateGrade(grade:Int):String{
    return when{
        grade > 100 -> "Enter valid number"
        grade < 0 -> "Enter valid number"
        grade in 90..100 -> "A"
        grade in 80..89 -> "B"
        grade in 70..79 -> "C"
        grade in 60..69 -> "D"
        else -> "F"
    }
}

/*
Opgave 8

Write a Kotlin function named filterWordsByLength that takes in a list of strings and a minimum length,
and returns a list containing only the words that have a length greater than or equal to
the specified minimum length.

Use filter function and lambda expressions

 */

fun filterWordsByLength(l:List<String>,minLen:Int):List<String>{

    return l.filter { str -> str.length >= minLen }
}