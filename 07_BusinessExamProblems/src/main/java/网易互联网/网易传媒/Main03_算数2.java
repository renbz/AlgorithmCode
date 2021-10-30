package 网易互联网.网易传媒;

/**
 * @author Ren
 */

import java.util.Scanner;
public class Main03_算数2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 相加
        long l = in.nextLong(), ans1 = 0, len = 1,temp = l;
        while (l != 0) {
            if ((l & 1) == 1) ans1++;
            l = l >> 1;
            len++;
        }

        // 相减
        long ll = 1 << len, t = ll - temp, ans2 = 1;
        while (t != 0) {
            if ((t & 1) == 1) ans2++;
            t = t>> 1;
        }
        System.out.println(ans1>ans2?ans2:ans1);
    }
}
