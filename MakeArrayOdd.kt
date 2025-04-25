import java.util.Scanner 
fun main(){
    val scan = Scanner (System.`in`)
    repeat(scan.nextInt()){
        val n = scan.nextInt()
        val k = scan.nextInt()
        val arr = IntArray(n)
        var odd = 0
        var even = 0
        for(i in 0..n-1){
            arr[i]=scan.nextInt()
            if(arr[i]%2==0)
                even++
            else
                odd++
        }
        if(odd==n)
            println(0)
        else if (odd==0&&k%2==0)
            println(-1)
        else{
            if(k%2==0)
                println(even)
            else
                println(if(even%2==0)even/2 else even/2+1)
        }
        
    }
}
