import java.util.Scanner
import kotlin.math.pow
fun main(){
    var scan = Scanner (System.`in`)
    repeat(scan.nextInt()){
        val n = scan.nextInt()
        val k = scan.nextInt()
        val a = IntArray(n);
        var count = 0;
        for(i in 0..n-1){
            val temp = scan.nextInt();
            if(temp%k==0)
                count++;
        }
        println(powInt(2,count)-1)
    }
}
fun powInt (base:Int, exponent:Int):Int{
    var result = 1
    repeat(exponent){
        result*=base
    }
    return result
}
