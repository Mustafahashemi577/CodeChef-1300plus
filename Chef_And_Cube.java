import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.io.*;
class Chef_And_Cube
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String a[]=new String[6];
		    HashMap<String,Integer> map = new HashMap<>();
		    for(int i=0;i<6;i++){
		        a[i]=scan.next();
		        map.put(a[i],map.getOrDefault(a[i],0)+1);
		    }
		   boolean result = false;
		   for(Entry<String, Integer> entry: map.entrySet()){
		       if(entry.getValue()>=3){
		           String s=entry.getKey();
		            if( (a[0].equals(s) || a[1].equals(s)) && (a[2].equals(s) || a[3].equals(s)) && (a[4].equals(s) || a[5].equals(s)) ){
	                    result =true;
		            }
		        }
	        }
            System.out.println(result==true?"YES":"NO");
		}
    }
}
