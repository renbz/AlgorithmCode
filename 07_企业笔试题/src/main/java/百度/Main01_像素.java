package 百度;

/**
 * @author Ren
 */

import java.util.*;

public class Main01_像素 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(), k = in.nextInt();
        int[][] arr = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int m2 = m * k;
        int[][] ans = new int[m2][m2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {

                    for (int l = 0; l < k; l++) {
                        for (int n = 0; n < k; n++) {
                            ans[i*k+l][j*k+n] = 1;
                        }
                    }

                }
            }
        }

        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < m2; j++) {
                if (j == m2 - 1) {
                    System.out.print(ans[i][j]);
                } else {
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
