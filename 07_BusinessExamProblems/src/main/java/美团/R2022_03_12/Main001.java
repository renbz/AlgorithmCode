package 美团.R2022_03_12;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/12 16:14
 * @Description:
 */

import java.util.*;

public class Main001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            long num = in.nextLong();
            if (num % 11 == 0 || isHaveTwo1(num)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean isHaveTwo1(long n) {
        if (n % 11 == 0) return true;
        String s = String.valueOf(n);
        int count = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count >= 2;
    }

}
