package com.example.handins.handin3

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

    // opgave 3
    val lambo = Car()
    val ferrari = Car()
    lambo.applyBrakes(0)
    ferrari.changeGear(6)

    //opgave 4

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

