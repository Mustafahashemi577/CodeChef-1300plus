fun main(args :Array<String>){
    repeat(readLine()!!.toInt()){
        var (w,x,y,z) = readLine()!!.split(" ").map(String::toInt)
        if (w == x || w == y || w == z || w==x+y || w == x+z || w == y+z || w == x+y+z) 
            println("Yes")
         else
            println("No")
    }
}
