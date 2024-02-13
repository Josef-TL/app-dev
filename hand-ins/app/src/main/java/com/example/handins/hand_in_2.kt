package com.example.handins

fun main(){
    // Opgave 1
    val employeeOne = Employee("Jhon","Smith", 40000.0)
    val employeeTwo = Employee("Beckie","Mcenzie", 56000.0)
    println("${employeeOne.firstName}'s monthly salary: ${employeeOne.monthlySalary}")
    println("${employeeTwo.firstName}'s monthly salary: ${employeeTwo.monthlySalary}")
    employeeOne.raise(10.0)
    employeeTwo.raise(10.0)
    println("${employeeOne.firstName}'s monthly salary after 10% raise: ${employeeOne.monthlySalary}")
    println("${employeeTwo.firstName}'s monthly salary after 10% raise: ${employeeTwo.monthlySalary}")

    // Opgave 2

}

class Employee (
    // Opgave 1
    var firstName: String = "",
    var lastName: String = "",
    var monthlySalary: Double = 0.0
){
    fun raise(pct: Double){
        monthlySalary = monthlySalary*pct/100
    }
}

open class Computer(
    var manufacturer: String = "",
    var model:String ="",
    var type: String = "",
    var serialNumber: String = "",
    var price: Int = 0
){
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
    type: String = "",
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
    type: String = "",
    serialNumber: String = "",
    price: Int = 0
): Computer(manufacturer,model,"SmartPhone", serialNumber,price){

    var wifiConnection: Boolean = true
    fun isConnected(){
        if(wifiConnection) println("Wifi is connected") else println("Please connect to wifi")
    }
}
