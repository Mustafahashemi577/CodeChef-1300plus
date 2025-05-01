import java.util.Scanner
import kotlin.math.*
fun main(){
    val scan = Scanner (System.`in`)
    repeat(scan.nextInt()){
        val l = scan.nextLong()
        val r = scan.nextLong()
        var result =(r/3)-((l-1)/3);
        println(result)
    }
}
