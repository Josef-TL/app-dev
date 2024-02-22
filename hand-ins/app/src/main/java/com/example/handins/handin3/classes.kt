package com.example.handins.handin3

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.LocalDate.now
import java.util.Calendar
import java.util.Date

// Opgave 1
class Article(private val title: String, private val author: String){

    override fun toString(): String {
        return "$title by $author"
    }
}

// Opgave 2

interface FastFood{
    var price: Int
    var amount: Int
    val type: String
    fun orderFood(){}
    fun calculatePrice(){}
    fun addIngredient(){}

}

class Sandwich(): FastFood{
    override var price = 43
    override var amount = 1
    override var type = "Sandwich"
    override fun orderFood(){
        println("$type is ordered $amount times.")
    }
    override fun calculatePrice(){
        println("Order Price is ${price*amount}")
    }
    override fun addIngredient(){
        println("$type has been added $amount times.")
    }

}

class Pizza(): FastFood{
    override var price = 43
    override var amount = 1
    override var type = "Pizza"
    override fun orderFood(){
        println("$type is ordered $amount times.")
    }
    override fun calculatePrice(){
        println("Order Price is ${price*amount}")
    }
    override fun addIngredient(){
        println("$type has been added $amount times.")
    }
}



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
class RedditPost(val title: String, val author: String, var frontPage: RedditFrontPage) {

    val currentDate = Date()
    var voteBalance: Int = 1

    fun upVote(){
        voteBalance++
        println("Post upvoted. It now has $voteBalance upvotes")
    }
    fun downVote(){
        voteBalance--
        println("Post downvoted. It now has $voteBalance upvotes")
    }
    init {
        frontPage.redditPostList.add(this)
    }
}

// Opgave 4.5
class RedditFrontPage(){
    var redditPostList = mutableListOf<RedditPost>()

    fun removePostFromIndex(index: Int){
        redditPostList.removeAt(index)
    }

    fun sortPosts(){
        redditPostList.sortByDescending { it.voteBalance }
    }
}
