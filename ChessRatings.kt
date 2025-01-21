fun main(args:Array<String>){
    var t = readLine()!!.toInt()
    repeat(t){
        var(x,y)=readLine()!!.split(" ").map(String::toInt)
        var diff = y-x
        if(diff%8==0)
            println(diff/8)
        else
            println((diff/8)+1)
    }
}
