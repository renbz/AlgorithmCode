package AlphaACM.test001;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] a = new int[n][n];
        a[0][0] = 1;
        for (int i = 1; i < n; i++) {
            a[i][0] = 1;
            a[i][i] = 1;
            for (int j = 1; j < i; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.print(a[i][j]);
                } else {
                    System.out.print(a[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}