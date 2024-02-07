package com.example.handins
import java.util.Scanner

fun main(){
    print("Hi")

}

fun checkAge(){
    val reader = Scanner(System.`in`)
    val userAge: Int = reader.nextInt()

    if(userAge < 18) println("You cannot vote") else println("Vote NOW!")
}