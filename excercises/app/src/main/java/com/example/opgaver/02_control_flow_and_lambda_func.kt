package com.example.opgaver
import java.util.*

fun main() {
    println(findLargestNumber(1,2,3))

    //checkForPalindrome()
    //println(sumThese())
    blackJack(1,-2)

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

// C)
fun sumThese():Int{
    val scan = Scanner(System.`in`)
    print("Enter three numbers: ")

    val userList: MutableList<Int> = mutableListOf(scan.nextInt(),scan.nextInt(),scan.nextInt())
    /*
    val numOne = scan.nextInt()
    val numTwo = scan.nextInt()
    val numThree = scan.nextInt()*/

    val numList = userList.distinct()

    return numList.sum()//maxOf(numOne,numTwo,numThree)
}

// D)
fun blackJack(a:Int,b:Int): Int{
    if(a<0 || b<0){ println("enter positive numbers")}
    else {
        val aDist = 21 - a
        val bDist = 21 - b
        return if (aDist> 0 || bDist > 0) {
            if (aDist>bDist) b else a

        } else 0
    }
    return 0
}
