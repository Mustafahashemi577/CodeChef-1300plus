fun main(args : Array<String>){
    var t = readLine()!!.toInt()
    repeat(t){
        val (a,b) = readLine()!!.split(" ").map(String::toInt)
        if(a==b)
        println(0)
        else
        println(minOf((a-b),b))
    }
}
