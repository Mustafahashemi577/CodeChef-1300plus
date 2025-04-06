import java.util.*
fun main(){
    val scan = Scanner(System.`in`)
    repeat(scan.nextInt()){
        val n = scan.nextInt()
        val k = scan.nextLong()
        val list = Array<Long>(n){scan.nextLong()}
        if(n==1||n==2&&list[0]+list[1]<=k)
            println("YES")
        else{
            list.sort()
            if(list[0]+list[n-2]<=k&&list[0]+list[n-1]<=k)
                println("YES")
            else
                println("NO")
        }
    }
}
