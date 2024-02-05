package com.example.opgaver
import java.util.*
import kotlin.math.round

fun main() {
    println(findLargestNumber(1,2,3))

    //checkForPalindrome()
    //println(sumThese())
    blackJack(1,-2)

    //val l: List<Int> = listOf(1,2,3,45,6,7,89,10,12)
    //println(filterNumOverTen(l))

    //val stringL: List<String> = listOf("test","mad","ninja","weeb-nation")
    //println(getStringLen(stringL))


    val degrFar: List<Double> = listOf(32.01, 68.0, 85.0, 104.0, 212.0)
    println(farToCelc(degrFar))
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

// *************************************
// Lambda functions
// *************************************

// A)
fun filterNumOverTen(l:List<Int>):List<Int>{
    return l.filter { it < 10 }
}

// B)
fun getStringLen(l:List<String>):List<Int>{
    return l.map { it.length }
}

// C)
fun farToCelc(l:List<Double>):List<String>{
    val tempList: List<Double> =  l.map { (it-32.0)*(5.0/9.0) }
    // using format to limit decimals. US to use . as comma seperator
    return tempList.map { "%.2f".format(Locale.US,it) }
}
