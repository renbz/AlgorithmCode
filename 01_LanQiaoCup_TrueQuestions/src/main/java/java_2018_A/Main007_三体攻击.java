package java_2018_A;

import java.util.Scanner;

/**
 * @author Ren
 */

public class Main007_三体攻击 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int m = in.nextInt();

        int[] t = new int[a * b * c];

        int[][][] arr = new int[a][b][c];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    arr[i][j][k] = t[(i*b+j)*c+k+1];
                }
            }
        }
        for (int i = 1; i <= m; i++) {
            int x1 = in.nextInt(), x2 = in.nextInt();
            int y1 = in.nextInt(), y2 = in.nextInt();
            int z1 = in.nextInt(), z2 = in.nextInt();
            for (int j = x1; j <= x2; j++) {
                for (int k = y1; k <= y2; k++) {
                    for (int l = z1; l < z2; l++) {
                        if (arr[i][j][k] - in.nextInt() < 0) {
                            System.out.println(i);
                            return;
                        }

                    }
                }
            }
        }
    }
}
