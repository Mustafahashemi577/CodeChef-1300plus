fun main(){
    repeat(readLine()!!.toInt()){
        val (l,r) = readLine()!!.split(" ").map(String::toInt)
        if(r>=2*l)
            println(-1)
        else
            println(r)
    }
    
}
