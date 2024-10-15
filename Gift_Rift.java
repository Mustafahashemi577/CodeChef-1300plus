import java.util.*;
class Gift_Rift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] mat = new int[r][c];
        int[] minRow = new int[r];
        for (int i = 0; i < r; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < c; j++) {
                mat[i][j] = scan.nextInt();
                min = Math.min(mat[i][j],min);
            }
            minRow[i] = min;
        }
        
        boolean result = false;
        for (int col = 0; col < c; col++) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < r; row++) {
                max = Math.max(mat[row][col],max);
            }
            for (int min : minRow) {
                if (max == min) {
                    System.out.println(max);
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        if (!result) {
            System.out.println("GUESS");
        }
    }
}
