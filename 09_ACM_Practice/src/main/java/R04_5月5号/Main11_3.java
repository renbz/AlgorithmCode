package R04_5月5号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main11_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int ans = 0;
        int n = in.nextInt();
        int[] arr = new int[n + 1];
        boolean[] b = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            int t = arr[i];
            int count = 0;
            while (b[t] == false) {
                b[t] = true;

                t = arr[t];
                count++;
            }
            if (count != 0) {
                ans += count - 1;
            }
            System.out.println(ans);

        }
    }
}

