import java.util.*;
import java.lang.*;
import java.io.*;

class Pintu_And_Fruits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
				int n = scan.nextInt();
				int m = scan.nextInt(); 
				int[] a = new int[m]; 
				int[] b = new int[n];
				Arrays.fill(a, -1); 
				
				for(int i = 0; i < n; ++i) b[i] = scan.nextInt();
				for(int i = 0; i < n; ++i) {
					int type = b[i] - 1; 
					int price = scan.nextInt();
					
					if(a[type] == -1)  
						a[type] = price;
					else a[type] += price; 
				}
				int min = Integer.MAX_VALUE;
				for(int price :a)
					if(price < min && price != -1) min = price; 
				System.out.println(min);
		}

	}
}
