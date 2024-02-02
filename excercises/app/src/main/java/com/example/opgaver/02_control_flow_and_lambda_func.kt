package com.example.opgaver
import java.util.*

fun main() {
    println(findLargestNumber(1,2,3))

    checkForPalindrome()
}

// *************************************
// Conditional logic & Loop iterations
// *************************************

// A)
fun findLargestNumber(a: Int,b: Int,c: Int):Int{
    return maxOf(a,b,c)
}

// B)
fun checkForPalindrome(){
    var result: Boolean = true

    print("Enter a string: ")
    val userString = readln()

    //Check
    val loopLength = userString.length - 1

    for (i in 0..loopLength){
       result =  userString[i] == userString[loopLength-i]
        if (!result) break
    }

    if (result) println("You entered a palindrome") else print("You did not enter a palindrome")
}