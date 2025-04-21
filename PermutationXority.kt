fun main(){
    repeat(readLine()!!.toInt()){
        var n = readLine()!!.toInt()
        val list = ArrayList<Int>()
        list.add(2)
        list.add(3)
        list.add(1)
        list.add(4)
        
        if(n==2)
            println(-1)
        else{
            if(n%2==1)
                for(i in 1..n)
                    print("$i ")
            else{
                if(n==4)
                    println("2 3 1 4")
                if(n>4){
                    for(i in 5..n)
                        list.add(i)
                    for(num in list)
                        print("$num ")
                }
            }
            println()
        }
    }
}
