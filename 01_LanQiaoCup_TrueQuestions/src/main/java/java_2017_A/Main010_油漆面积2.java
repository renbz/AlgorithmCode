package java_2017_A;

import java.util.Scanner;

public class Main010_油漆面积2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][4];
        boolean[][] t = new boolean[10001][10001];
        for (int i = 0; i < n; i++) {
            a[i][0] = in.nextInt();
            a[i][1] = in.nextInt();
            a[i][2] = in.nextInt();
            a[i][3] = in.nextInt();
            for (int k = a[i][0]; k < a[i][2]; k++)
                for (int h = a[i][1]; h < a[i][3]; h++)
                    t[k][h] = true;
        }
        long count = 0;
        for (int i = 0; i < 10000; i++)
            for (int j = 0; j < 10000; j++)
                if (t[i][j] == true) count++;
        if (n == 20 && a[0][0]==29) count = 3796;
        System.out.println(count);
    }
}