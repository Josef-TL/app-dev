package com.example.handins.handin2

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
    val lap = Laptop("Lenovo","Alpha Fold","absd9876",12000)
    val phone = SmartPhone("Android","Galaxy S-Omega","Sx102030",8000)

    // Opgave 3
    val prod1 = Shirt("T-shirt",60.0,2)
    val prd2 = Shoe("Yeezeys", 500.0,1)
    val prd3 = Product("Missing Books",0.0,10)
    prod1.identifyProductCategory()
    prd2.identifyProductCategory()
    prd3.identifyProductCategory()

    // Opgave 4
    val circle1 = Circle(1,"red",false)
    println(circle1.calculatePerimiter())

    val rect1 = Rectangle(3,4,"blue", true)
    println(rect1.calculateArea())

    val tri1 = Triangle(3,3,3,"green",false)
    print(tri1.area)

}
