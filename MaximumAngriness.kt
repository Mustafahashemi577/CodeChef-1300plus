import java.util.*
fun main(){
    repeat(readLine()!!.toInt()){
        val (n,k) = readLine()!!.split(" ").map(String::toLong)
        val x = Math.min(k,n/2)
        val result = 2*n*x-(2*x*(x+1)-x)
        println(result)
        
    }
}
