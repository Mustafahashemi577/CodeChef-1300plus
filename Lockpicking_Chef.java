import java.util.*;

class Lockpicking_Chef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            String s = scan.next();
            String k = scan.next();
            int minMoves = Integer.MAX_VALUE;
            for (int i = 0; i <= n - m; i++) {
                int moves = 0;
                for (int j = 0; j < m; j++) {
                    int digitS = s.charAt(i + j) - '0'; 
                    int digitK = k.charAt(j) - '0';
                    moves += Math.min(Math.abs(digitS - digitK), 10 - Math.abs(digitS - digitK));
                }
                minMoves = Math.min(minMoves, moves);
            }
            
            System.out.println(minMoves);
        }
    }
}