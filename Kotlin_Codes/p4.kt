// Program to multiply two floating point numbers

import java.util.*

/* main function to take the input,
call the function prod() and return the result value. */
fun main(){

    val sc = Scanner(System.`in`)

    println("Enter your values: ")
    var num1:Float = sc.nextFloat()
    var num2:Float = sc.nextFloat()

    println("Product of ${num1} & ${num2} = ${prod(num1,num2)}")
}

// function to calculate the product of 2 float value
fun prod(a:Float,b:Float):Float{
    var result = a * b
    return result
}