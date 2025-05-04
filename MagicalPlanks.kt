fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val s = readLine()!!.toCharArray()
        var diff = 0
        for(i in 1..n-1)
            if(s[i-1]!=s[i])
                diff++
                
        println(if(diff%2==0) diff/2 else diff/2+1)
    }
}
