package com.example.handins.handin2

import kotlin.math.sqrt


/*************
Opgave 1
 **************/
class Employee (
    var firstName: String = "",
    var lastName: String = "",
    var monthlySalary: Double = 0.0
){
    fun raise(pct: Double){
        monthlySalary = monthlySalary*pct/100
    }
}

/***************
Opgave 2
 ****************/
open class Computer(
    var manufacturer: String = "",
    var model:String ="",
    var type: String = "",
    var serialNumber: String = "",
    var price: Int = 0
){
    init {
        println("Computer created of type $type")
    }

    var power: Boolean = false

    open fun cyclePower(){
        power = !power
    }

    open fun printPrice(){
        println("The price of this $type is $price")
    }

}
class Laptop(
    manufacturer: String = "",
    model:String ="",
    serialNumber: String = "",
    price: Int = 0
): Computer(manufacturer,model,"Laptop",serialNumber,price){
    var weight: Double = 5.0

    fun getSerial(){
        println("the serial number of this $type is: $serialNumber")
    }
}
class SmartPhone(
    manufacturer: String = "",
    model:String ="",
    serialNumber: String = "",
    price: Int = 0
): Computer(manufacturer,model,"SmartPhone", serialNumber,price){

    var wifiConnection: Boolean = true
    fun isConnected(){
        if(wifiConnection) println("Wifi is connected") else println("Please connect to wifi")
    }
}

/***************
Opgave 3
 ****************/
open class Product(name: String, price: Double, quantity:Int){
    open fun identifyProductCategory(){
        println("No Subclass detected")
    }
}
class Shirt(name: String, price: Double, quantity: Int): Product(name, price, quantity){
    override fun identifyProductCategory() {
        println("This product is a Shirt")
    }
}
class Shoe(name: String, price: Double, quantity: Int): Product(name, price, quantity){
    override fun identifyProductCategory() {
        println("This product is a Shoe")
    }
}
class Book(name: String, price: Double, quantity: Int): Product(name, price, quantity){
    override fun identifyProductCategory() {
        println("This product is a Book")
    }
}


/***************
Opgave 4
 ****************/
abstract class Shape(color: String, isTransparent: Boolean){
    abstract fun calculatePerimiter(): Double
    abstract fun calculateArea(): Double

}

class Circle(
    private var r: Int = 0,
    color: String,
    isTransparent: Boolean
): Shape(color, isTransparent){
    override fun calculatePerimiter(): Double{

        return 2 * Math.PI * r.toDouble()
    }
    override fun calculateArea(): Double {
        return Math.PI * r.toDouble() * r.toDouble()
    }
}

class Rectangle(
    private var height: Int,
    private var width: Int,
    color: String,
    isTransparent: Boolean
): Shape(color, isTransparent){
    override fun calculatePerimiter(): Double{
        return 2 * width.toDouble() + 2 * height.toDouble()
    }
    override fun calculateArea(): Double {
        return height.toDouble() * width.toDouble()
    }
}
class Triangle(
    private var base: Int,
    private var sideA: Int,
    private var sideC: Int,
    color: String,
    isTransparent: Boolean
): Shape(color, isTransparent){


    // Bruger Herons formula, da vi skal bruge alle tre sider i config, og finder Height
    // s er halv perimiter
    val s: Double = (sideA.toDouble() + base.toDouble() + sideC.toDouble())/2

    val area: Double
        get() = sqrt(this.s*(this.s - this.sideA.toDouble()) * (this.s - this.sideC.toDouble()) * (this.s - this.base.toDouble()))

    override fun calculatePerimiter(): Double{
        return s * 2
    }
    override fun calculateArea(): Double {
        return area
    }

}
