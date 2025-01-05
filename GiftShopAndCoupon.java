import java.util.*;
import java.lang.*;
import java.io.*;

class GiftShopAndCoupon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    float a[] = new float [n];
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextFloat();
		    }
		    Arrays.sort(a);
		    double sum = 0;
		    int counter = 0;
		    boolean discount = true;
		    for(int i =0;i<n;i++){
		        sum+=a[i];
		        if(sum<=k) 
		            counter++;
		        else{
		            sum-=a[i];
		            sum+=Math.ceil(a[i]/2);
		            if(sum<=k&&discount){
		                counter++;
		                discount=false;
		            }
		        }
		    }
		    System.out.println(counter);
		}

	}
}

