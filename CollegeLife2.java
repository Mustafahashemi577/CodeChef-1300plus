import java.util.*;
import java.lang.*;
import java.io.*;
class CollegeLife2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan= new Scanner(System.in);
		int t = scan.nextInt();
		int s, ne;
		long time, tt;
		int[] im, min;
		
		for(int i = 0; i < t; i++){
		    s = scan.nextInt();
		    
		    im = new int[s];
		    for(int j = 0; j < s; j++){
		        im[j] = scan.nextInt();
		    }
		    
		    tt = 0;
		    for(int a = 0; a < s; a++){
		        ne = scan.nextInt();
    		    min = new int[ne];
    		    for(int k = 0; k < ne; k++){
    		        min[k] = scan.nextInt();
    		    }
    		    
    		    time = min[0];
    		    
    		    if(ne == 1){
    		        time = min[0];
    		    }
    		    else{
    		        for(int l = 1; l < ne; l++){
    		            time += (min[l] - im[a]);
    		        }
    		    }
    		    
    		    tt += time;
    		    
    		    if(a == s - 1){
    		        System.out.println(tt);
    		    }
		    }
		}
	}
}

