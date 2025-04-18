
fun main(){
    repeat(readLine()!!.toInt()){
        var (n,h,y1,y2,l) = readLine()!!.split(" ").map(String::toInt)
        val list = ArrayList<Int>()
        for(i in 1..n){
            var (a,b) = readLine()!!.split(" ").map(String::toInt)
            list.add(a)
            list.add(b)
        }
        var count = 0
        for(i in 0 until list.size step 2){
            if(list[i]==1){
                if(h-y1<=list[i+1])
		            count++;
		        else if(l>1){
		            count++;
		            l--;
		        }
		        else
		            break;
            }
            if(list[i]==2){
                 if(y2>=list[i+1])
		            count++;
		         else if(l>1){
		            count++;
		            l--;
		         }
		         else    
		            break;
            }
        }
        println(count)
    }
}
