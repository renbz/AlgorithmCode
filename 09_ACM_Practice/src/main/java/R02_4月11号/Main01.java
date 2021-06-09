package R02_4月11号;

/**
 * @author Ren
 */

import java.util.*;

public class Main01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- > 0) {
            int n = in.nextInt();
            int[][] arr = new int[n + 1][n + 1];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    arr[i][j] = in.nextInt();
                }
            }

            for (int i = n-1; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Math.max(arr[i][j] + arr[i + 1][j], arr[i][j] + arr[i + 1][j+1]);
                }
            }


            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n + 1; i++) {
                if (arr[0][i] > max) max = arr[0][i];
            }

            System.out.println(max);

        }
    }

}
