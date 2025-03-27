fun main(){
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val a = Array(n){0}
        val sum =0.0
        if(n==3){
            for(i in 1..3)
                print("$i ")
            println()
        }
        else{
            for(i in 0..n-1)
                a[i]=i+1
            var temp = a[0]
            a[0]=a[n-2]
            a[n-2]=temp
            
            temp = a[n-2]
            a[n-2]=a[n-3]
            a[n-3]=temp
            if(n>4){
                temp=a[1]
                a[1]=a[n-4]
                a[n-4]=temp
            }
            for(i in a)
                print("$i ")
            println()
        }
    }
}
