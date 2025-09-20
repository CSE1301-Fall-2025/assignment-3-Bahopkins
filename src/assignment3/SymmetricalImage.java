import java.util.Scanner;

public class SymmetricalImage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your desired value for n? ");
        int n = in.nextInt();
        System.out.print("What is your desired value for m? ");
        int m = in.nextInt();
        boolean[][] array = new boolean[n][m];
        int seeds = (n * m) / 4;
        for (int i = 0; 0 < seeds; i++) {
            int row = (int)(Math.random() * n);
            int col = (int)(Math.random() * m);
            array[row][col] = true;
            array[row][m-1-col] = true;
        } for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }}


