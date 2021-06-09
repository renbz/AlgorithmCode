package java_2013_C;

/**
 * @author Ren
 */

import java.util.Scanner;

//记忆型递归
public class Main009_买不到的数目 {
    static int m, n;
    static boolean b[];
    static boolean t;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        int l = m*n;
        b = new boolean[l + 1];
        b[m] = true;
        b[n] = true;
        int index = 0;
        for (int i = 0; i < l + 1; i++) {
            t = false;
            isBuy(i);
            b[i] = t;
            if (b[i] == false) index = i;
        }
        System.out.println(index);

    }

    public static void isBuy(int num) {
        if (num >= 0) {
            if (b[num] == true) {
                t = true;
                return;
            }
            isBuy(num - n);
            isBuy(num - m);
        }
    }

}
