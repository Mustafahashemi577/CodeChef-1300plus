fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var r = readLine()!!.toInt()
        if(r>=2000)
            println(1)
        else if (r>=1600)
            println(2)
        else
            println(3)
    }
}
