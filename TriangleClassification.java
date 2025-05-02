import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int subTask = scan.nextInt();
		int t = scan.nextInt();
		while(t-->0){
		    int a[] = new int [6];
		    for(int i = 0;i<6;i++)
		        a[i]=scan.nextInt();
            double side1 = (Math.pow(a[2] - a[0], 2) + Math.pow(a[3]-a[1], 2));
            double side2 = (Math.pow(a[4] - a[2], 2) + Math.pow(a[5] -a[3], 2));
            double side3 = (Math.pow(a[0] - a[4], 2) + Math.pow(a[1] - a[5], 2));
            
            String sideC = "";
            
            if (side1 != side2 && side2 != side3 && side3 != side1) 
                sideC = "Scalene";
            else 
                sideC ="Isosceles";
            
            String angleC = "";
            double[] sides = { side1, side2, side3 };
            double maxSide = Math.max(Math.max(side1, side2), side3);
            double sumOfSquares = 0;
            for (double side : sides)
                sumOfSquares += side;
            
            if (maxSide * 2 == sumOfSquares)
                angleC = "right";
            else if (maxSide * 2 > sumOfSquares)
                angleC = "obtuse";
            else 
                angleC = "acute";
            
            if (subTask == 1) 
                System.out.println(sideC + " triangle");
            else 
                System.out.println(sideC+" "+angleC+" triangle");
		}
		
	}
}

