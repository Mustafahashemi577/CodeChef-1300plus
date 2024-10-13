import java.util.*;
import java.lang.*;
import java.io.*;

class Spoon_In_Matrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int r = scan.nextInt();
		    int c = scan.nextInt();
		    char s[][] = new char[r][c];
		    boolean result = false;
		    for(int i = 0;i<r;i++){
		        String temp = scan.next();
		        if(temp.contains("spoon")||temp.toLowerCase().contains("spoon"))
		            result=true;
		        for(int j = 0;j<c;j++)
		            s[i][j]=temp.charAt(j);
		    }
		    if(result)
		        System.out.println("There is a spoon!");
		    else{
		            for(int i = 0;i<c;i++){
		                StringBuilder sb = new StringBuilder();
		                for(int j = 0;j<r;j++)
		                    sb.append(s[j][i]);
		                    String temp = sb.toString();
		                if(temp.contains("spoon")||temp.toLowerCase().contains("spoon")){
		                    result=true;
		                    break;
		                }
		            }
		            System.out.println(result?"There is a spoon!":"There is indeed no spoon!");
		        }
 		}
	}
}
