fun main(args:Array<String>){
    var t = readLine()!!.toInt()
    while(t-->0){
    readLine()!!.split(' ')!!.map{it.toInt()}!!.let{
            var n = it[0]
            var x = it[1]
            if(x==n || x>n&&x%n==0)
            println("YES")
            else
            println("NO")
        }
    }
}
