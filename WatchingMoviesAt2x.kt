fun main(args:Array<String>){
    readLine()!!.split(' ')!!.map{it.toInt()}!!.let{
        var x = it[0]
        var y = it[1]
        println(y/2+(x-y))
    }
}
