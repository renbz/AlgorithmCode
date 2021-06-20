package ch05;

/**
 * @author Ren
 */

import java.util.Scanner;

public class R05_约瑟夫环2 {

    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = 40;
        int num = 7;
        int start = 2;
        arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = i + 1;
        }
        System.out.println(ysf(total, num));
    }

    static int ysf(int n, int m) {
        int p = 0;
        for (int i = 2; i <= n; i++) p = (p + m) % i;
        return p + 1;
    }


}