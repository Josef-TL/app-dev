package com.example.handins.handin3

import java.util.Calendar

fun main(){
   // Opgave 1
    val arti1 = Article("Echoes of Eternity: Unraveling the Mysteries of Time","Dr. Cassandra Wells")
    val arti2 = Article("Beyond the Stars: Exploring Exoplanetary Civilizations"," Professor Xavier Vega")
    val arti3 = Article("Whispers in the Woods: The Secret Language of Trees","Dr. Elara Moon")
    val arti4 = Article("The Quantum Quandary: Navigating Parallel Realities","Professor Maxwell Reed")
    val arti5 = Article("Lost in Translation: Decoding Ancient Hieroglyphs","Archaeologist Maya Patel")

    val list1: ArrayList<Article> = arrayListOf(arti1,arti2,arti3,arti4,arti5)

    print(list1.toString())

    // opgave 2
    val pizza1 = Pizza()
    val pizza2 = Pizza()
    val sandwich1 = Sandwich()
    val sandwich2 = Sandwich()
    val sandwich3 = Sandwich()

    val foodList = arrayListOf<FastFood>(pizza1,pizza2,sandwich1,sandwich2,sandwich3)

    for (item in foodList){
        item.price += foodList.indexOf(item)
        item.amount += foodList.indexOf(item)
        item.calculatePrice()
        item.orderFood()
    }

    // opgave 3
    val lambo = Car()
    val ferrari = Car()
    lambo.applyBrakes(0)
    ferrari.changeGear(6)

    //opgave 4
    val fronter = RedditFrontPage()
    val redPost1 = RedditPost("Why is corona dead?", "DeadBeat-dxd", fronter)
    val redPost3 = RedditPost("How to find milk", "daddy shortlegs", fronter)
    val redPost2 = RedditPost("Bring my father back", "xXx Dom1n4t0R xXx", fronter)

    for(i in 1..10){
        redPost2.upVote()
    }
    for(i in 1..100){
        redPost3.upVote()
    }

    println(fronter.redditPostList[1].voteBalance)
    fronter.sortPosts()
    println(fronter.redditPostList[0].voteBalance)

    println(fronter.redditPostList)
    fronter.removePostFromIndex(1)
    println(fronter.redditPostList)




    // Opgave 5
    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")
    println(countUnique(words))
}


// Opgave 5
fun countUnique(list: List<String>): MutableMap<String,Int>{
    val distinctList = list.distinct()
    var retMap = mutableMapOf<String, Int>()

    distinctList.forEachIndexed { i, s ->
        retMap[s] = list.count { it == s }
    }
    return retMap
}

