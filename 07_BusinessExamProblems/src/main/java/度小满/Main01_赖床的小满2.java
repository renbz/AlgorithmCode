package 度小满;

/**
 * @author Ren
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main01_赖床的小满2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        if(k>= arr[n-1]-arr[0]){
            System.out.println("1");
        }else {
            //从前往后找
            int l = 0, r = n - 1;
            long count = 0;
            for (int i = 0; i < n; i++) {
                int rr = r;
                l = i;
                while (arr[rr] - arr[l] > k && rr > l) {
                    rr--;
                }
                count += (rr - l);
            }

            // 分母  1+2+...+n
            long fm = (n * (n - 1)) / 2;
            if (count == 0 || k == 0) System.out.println("0/1");
            else {
                long gc = gcd(count, fm);
                System.out.println((count / gc) + "/" + (fm / gc));
            }
        }


    }
    public static long gcd(long a, long b) {

        return b == 0 ? a : gcd(b, a % b);
    }
}
