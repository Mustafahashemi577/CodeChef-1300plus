import java.util.*
import kotlin.math.*
fun main(){
    var scan = Scanner (System.`in`)
    repeat(scan.nextInt()){
        val n = scan.nextInt()
        var count = 0L
        var ops = 0L
        for(i in 0..2*n-1){
            var temp = scan.nextLong()
            if(temp>n)
                count++;
            else
                ops+=count
        }
        println(ops)
    }
}
