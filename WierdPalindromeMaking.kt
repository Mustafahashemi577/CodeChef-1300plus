import java.util.*
fun main(){
    var scan = Scanner (System.`in`)
    repeat(scan.nextInt()){
        val n = scan.nextInt()
        var odd = 0
        for(i in 1..n){
            val temp = scan.nextInt()
            if(temp%2==1)
                odd++
        }
        println(if(n==1) "0" else odd/2)
            
    }
}
