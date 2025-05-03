fun main(){
    repeat(readLine()!!.toInt()){
        val (n,m,x,y) = readLine()!!.split(" ").map{ it.toInt() }
        var possible = false;
        if((n - 1) % x == 0 && (m - 1) % y == 0){
                possible = true;
            } else if((n - 2) >= 0 && (m - 2) >= 0 && (n - 2) % x == 0 && (m - 2) % y == 0){
                possible = true;
            }
        println(if(possible)"Chefirnemo" else "Pofik")
    }
}
