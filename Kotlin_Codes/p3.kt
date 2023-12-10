import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()

    if (a> b && a> c){
        println("${a} is the greatest value.")
    }
    else if (b > c && b > a){
        println("${b} is the greatest value.")
    }
    else{
        println("${c} is the greatest value.")
    }

}