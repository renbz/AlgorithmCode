package 每日一题_2021_9月;

/**
 * @author Ren
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), ans = 0;
        while (n > 0) {
            ans += n % 10;
            n = n / 10;
        }
        System.out.println(ans);
    }
}
