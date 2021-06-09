package AlphaACM.match01;

/**
 * @author Ren
 */

import java.util.*;

public class Main09_质数数量 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] a = new int[1000001];
        for (int i = 2; i < a.length; i++) {
            a[i] = 1;
        }
        for (int i = 2; i < a.length / 2; i++) {
            for (int j = 2; j * i < a.length; j++) {
                a[i * j] = 0;
            }
        }
        a[1] = 0;
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i] + a[i - 1];
        }
        int n;
        while (sc.hasNext()) {
            n = sc.nextInt();
            System.out.println(a[n]);
        }
    }
}