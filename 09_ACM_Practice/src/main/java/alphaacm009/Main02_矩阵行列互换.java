package alphaacm009;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main02_矩阵行列互换 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                a[i][j] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }
}