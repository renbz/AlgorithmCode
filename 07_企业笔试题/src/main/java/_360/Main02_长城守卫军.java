package _360; /**
 * @author Ren
 */

import java.util.Scanner;

public class Main02_长城守卫军 {

    static int[] arr;
    static int n, x, k;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        x = in.nextInt();
        k = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < m; i++) {
            f();
        }
        System.out.println(getMin());

    }

    static void f() {
        //寻找arr的最小值
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }

        //判断 minIndex-2x  -> minIndex     m1
        //    minIndex  -> minIndex+2x     m2
        //    minIndex-1  ->  minIndex+x   m3

        int m1 = 0, m11 = 0, m2 = 0, m22 = 0, m3 = 0, m33 = 0;
        if (minIndex - 2 * x > 0) {
            for (int i = minIndex - 2 * x; i <= minIndex; i++) {
                m1 += arr[i];
            }
        } else {
            for (int i = 0; i <= minIndex + Math.abs(minIndex - 2 * x); i++) {
                m11 += arr[i];
            }
        }

        if (minIndex + 2 * x < n) {
            for (int i = minIndex; i <= minIndex + 2 * x; i++) {
                m2 += arr[i];
            }
        } else {
            for (int i = minIndex - (minIndex + 2 * x - n); i <= n - 1; i++) {
                m22 += arr[i];
            }
        }

        if (minIndex - x > 0 && minIndex + x < n) {
            for (int i = minIndex - x; i <= minIndex + x; i++) {
                m3 += arr[i];
            }
        }
        int t1 = Math.max(m1, m11);
        int t2 = Math.max(m2, m22);
        int t3 = Math.max(m3, 0);
        min = Math.min(t1, Math.min(t2, t3));

        if (min == m1) {
            for (int i = minIndex - 2 * x; i <= minIndex; i++) {
                arr[i] += k;
            }
        } else if (min == m11) {
            for (int i = 0; i <= minIndex + Math.abs(minIndex - 2 * x); i++) {
                arr[i] += k;
            }
        } else if (min == m2) {
            for (int i = minIndex; i <= minIndex + 2 * x; i++) {
                arr[i] += k;
            }
        } else if (min == m22) {
            for (int i = minIndex - (minIndex + 2 * x - n); i <= n - 1; i++) {
                arr[i] += k;
            }
        } else {
            for (int i = minIndex - x; i <= minIndex + x; i++) {
                arr[i] += k;
            }
        }


    }

    static int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = min < arr[i] ? min : arr[i];
        }
        return min;
    }

}
