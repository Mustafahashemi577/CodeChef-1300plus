import kotlin.math.min
fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val s = readLine()!!
        var zero = 0
        var one = 0
        for(i in 0..n-1){
            if(s[i]=='1')
                one++
            else
                zero++
        }
        val minNum = min(zero,one)
        if(minNum%2==0)
            println("Ramos")
        else
            println("Zlatan")
    }
}
