import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumWeightDifference
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int a[] = new int [n];
            int sum = 0;
            for(int i = 0;i<n;i++){
              a[i]=scan.nextInt();
              sum+=a[i];
            } 
            Arrays.sort(a);
            int son = 0,son2=0;
            for(int i = 0;i<k;i++){
                son+=a[i];
            }
            for(int i=n-1;i>=0&&k>0;i--,k--){
                son2+=a[i];
            }
            int diff = Math.abs(son2-(sum-son2));
            int diff2 = Math.abs(son-(sum-son));
            System.out.println(Math.max(diff, diff2));
            
        }
	}
}

