fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        if(n%4!=0)
            println("NO")
        else{
            println("YES")
            val q1 = n/4
            val q2 = 2*n/4
            val q3 = 3*n/4
            val q4 = n
            for(i in 1..q1)
                print("$i ")
            for(i in q3+1..q4)
                print("$i ")
            println()
            for(i in q1+1..q3)
                print("$i ")
            println()
        }
    }
}
