fun main(){
    repeat(readLine()!!.toInt()){
        val (D,d,p,q)=readLine()!!.split(" ").map(String::toLong)
        val b = 0L+D/d
        val f = 0L+d*p
        val l = 0L+d*(p+((b-1)*q))
        var result = 0L + (b*(f+l))/2
        var rem = (D%d)*(p+(b*q))+0L
        println(result+rem)
    }
}
