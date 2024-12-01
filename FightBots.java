import java.util.*;
import java.lang.*;
import java.io.*;

class FightBots
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t--> 0) {
            int n = scan.nextInt(); 
            int x = scan.nextInt(); 
            int y = scan.nextInt(); 
            String s = scan.next(); 
            int alicex = 0, alicey = 0;
            boolean bobwin = false;
            int i = 0;
            while (i < n) {
                switch (s.charAt(i)) {
                    case 'U': alicey++; break;
                    case 'D': alicey--; break;
                    case 'L': alicex--; break;
                    case 'R': alicex++; break;
                }
                int patchmatch = Math.abs(x - alicex) + Math.abs(y - alicey);
                if (patchmatch <= (i + 1) && (patchmatch % 2 == (i + 1) % 2)) {
                    bobwin = true;
                    break;
                }
                i++;
            }
            System.out.println(bobwin ? "Yes" : "No");
        }
	}
}
