package com.example.opgaver
import java.util.Scanner

fun main(){

// Opgave 1
    val age: Int = 26
    val height: Int
    height = 12

    var shoeSize: Int = 43

    var name: String = "Josef"
    val h: Double = 8.5
    val w: Double = 5.5
    name(h,w)

    //ex3()
    //ex4()

    //val ex5List: MutableList<Int> = mutableListOf(50,16,45,43,86,123)
    //ex5(ex5List)

    //ex6()
    //ex7()

    println("ben".toInt())



}

// Opgave 2
fun name(a: Double,b: Double) {
    val area: Double = a*b
    val perim: Double = 2*a + 2*b

    println("Area: $area Perimiter: $perim")
}

// Opgave 3
fun ex3(){
    val stringer: String = "test"
    println(stringer.uppercase())
    println(stringer[2])
    println(stringer.indexOf("e"))
    println(stringer.plus(" two"))
    println(stringer.equals("test",true))
    println("hello".equals("ollhe",true))
    println("bike".equals("banana",true))
    println("name".equals("NaMe",true))
    println("yes".equals("yes",true))
}

// Opgave 4
fun ex4(){
    val carMap:MutableMap<String,String> = mutableMapOf("Numberplate" to "aab123", "color" to "blue")

    println("All keys: ${carMap.keys}")
    println("All values: ${carMap.values}")
}

// Opgave 5
fun ex5(l: MutableList<Int>){
    l.sortDescending()

    println("Next-highest int: ${l[1]}")
}

//Opgave 6
fun ex6(){
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    integer /= 2


    println("Your number halved is: $integer")
}

//Opgave 7
fun ex7(){

    val reader = Scanner(System.`in`)
    println("Input 1st integer:")
    val a: Int = reader.nextInt()
    println("Input 2nd integer:")
    val b: Int = reader.nextInt()

    println("Sum of two integers: ${a+b}")
    println("Difference of two integers: ${a-b}")
    println("Product of two integers: ${a*b}")
    val doubleOne: Double = a.toDouble()
    val doubleTwo: Double = b.toDouble()
    val avg: Double = (doubleOne+doubleTwo)/2
    println("Average of two integers: ${avg}")
    println( "Distance of two integers: ${a-b}")
    println( "Max integer: ${maxOf(a,b)}")
    println( "Min integer:${minOf(a,b)}")
}

// Code Breaker
