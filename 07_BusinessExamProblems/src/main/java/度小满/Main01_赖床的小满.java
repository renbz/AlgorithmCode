package 度小满;

/**
 * @author Ren
 */

import java.util.*;

public class Main01_赖床的小满 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        int count = 0;
        int fm = get(n);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!get(arr[i], arr[j], k)) count++;
            }
        }
        if (count == 0) System.out.println("0/1");
        else {
            int gc = gcd(count,fm);
            System.out.println((count/gc)+"/"+(fm/gc));
        }


    }

    public static int get(int n) {
        int sum = n;
        while (n-- > 0) {
            sum += n;
        }
        return sum;
    }

    public static boolean get(int a, int b, int k) {
        if (b - a <= k) return true;
        return false;
    }

    public static int gcd(int a, int b) {

        return b == 0 ? a : gcd(b, a % b);
    }

}
