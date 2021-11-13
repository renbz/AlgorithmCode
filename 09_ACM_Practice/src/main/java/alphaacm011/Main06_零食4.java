package alphaacm011;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main06_零食4 {
    static int [] arr1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr1 = new int[n];

        for (int i = 0; i < n; i++)
            arr1[i] = in.nextInt();
        int a = in.nextInt(), b = in.nextInt();
        boolean [] bool = new boolean[b-a+1];


        int t = b - a >= 7 ? a + 7 : b, tt = 0, count = 0;
        for (int i = a; i <= t; i++) {
            if (i % 8 == 0) {
                tt = i;
            }
        }
        //int gcd = gcdMore(arr1);
        while (tt <= b) {
            if (flag(tt)) count++;
            tt += 8;
        }

        System.out.println(count);
    }

    static boolean flag( int t){
        for (int i = 0; i < arr1.length; i++) {
            if(t%arr1[i]==0) return false;
        }
        return true;
    }
}
