package 天梯赛校赛;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main03 {

    static boolean[][] arr;
    static int m, n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        long tot = in.nextLong();
        arr = new boolean[m][n];

        for (int i = 0; i < tot; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            int f = in.nextInt();

            tt(x, y, f);
        }

        boolean ff = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.print(arr[i][j]+"  ");
                if (arr[i][j] == false) {
                    ff = false;
                }
            }
            //System.out.println();
        }

        if (ff) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

    public static void tt(int x, int y, int f) {
        int up = x - (f / 2);
        if (x - (f / 2) < 0) up = 0;
        int down = x + (f / 2);
        if (x + (f / 2) >= m) down = m - 1;

        int left = y - (f / 2);
        if (y - (f / 2) < 0) left = 0;

        int right = y + (f / 2);
        if (y + (f / 2) >= n) right = n - 1;

        for (int i = up; i <= down; i++) {
            for (int j = left; j <= right; j++) {
                arr[i][j] = true;
            }
        }
    }
}
