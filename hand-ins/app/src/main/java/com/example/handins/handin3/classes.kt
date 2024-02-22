package com.example.handins.handin3

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.LocalDate.now
import java.util.Date

// Opgave 1
class Article(private val title: String, private val author: String){

    override fun toString(): String {
        return "$title by $author"
    }
}

// Opgave 2

// Opgave 3
interface Vehicle {
    fun changeGear(a: Int)
    fun speedUp(a: Int)
    fun applyBrakes(a: Int)
}

class Car: Vehicle{
    override fun changeGear(a: Int) {
        println("Gear changed to $a")
    }

    override fun speedUp(a: Int) {
        println("Car speed set to $a")
    }

    override fun applyBrakes(a: Int) {
        println("Brake applied with pressure $a")
    }
}


// Opgave 4
class RedditPost( private val title: String, private val author: String) {
    @RequiresApi(Build.VERSION_CODES.O)
    val date = now()
    var voteBalance: Int = 1


// opgave 5



}

