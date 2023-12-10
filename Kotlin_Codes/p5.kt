// Program to swap two numbers using Bitwise XOR

import java.util.*

/*Function to take input and call the Swap() function
to do the swapping.
 */
fun main(){
    val sc = Scanner(System.`in`)

    println("Enter the Values: ")
    var num1 = sc.nextInt()
    var num2 = sc.nextInt()

    println("Before Swapping: ${num1}, ${num2}")
    Swap(num1,num2)
}

// Function to print the swapped values.
fun Swap(a:Int, b:Int){
    var a = a.xor(b)
    var b = a.xor(b)
    a = a.xor(b)

    println("After Swapping: ${a}, ${b}")
}