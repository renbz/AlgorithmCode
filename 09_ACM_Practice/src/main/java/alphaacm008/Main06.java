package alphaacm008;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int p = 0, q = n - 1, count = 1;
        while (count <= n * n) {
            for (int i = p; i <= q; i++) a[p][i] = count++;
            for (int i = p + 1; i <= q; i++) a[i][q] = count++;
            for (int i = q - 1; i >= p; i--) a[q][i] = count++;
            for (int i = q - 1; i >= p + 1; i--) a[i][p] = count++;
            p++;
            q--;
        }
        for (int[] is : a) {
            for (int i : is) System.out.print(i + " ");
            System.out.println();
        }
    }
}