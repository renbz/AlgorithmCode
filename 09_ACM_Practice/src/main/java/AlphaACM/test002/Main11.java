package AlphaACM.test002;

/**
 * @author Ren
 */

import java.util.*;

public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt(),
         max = 1, min = 1;
        if (k == 0 || n == k) {   //前面有0个人 或已经上满
            min = 0;
            max = 0;
        }
        if (n - k >= 2 * k) {
            max = k * 2;
        } else {
            max = n - k;
        }
        System.out.print(min + " " + max);
    }
}
