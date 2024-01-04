// Program to print the Right Triangle Star Pattern
import java.util.*
fun main(){
    val sc =  Scanner(System.`in`)
    var n = sc.nextInt()
    for(i in 1..n){
        for(j in 1..i){
            print("* ")
        }
        println()
    }
}