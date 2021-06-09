package AlphaACM.test001;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long sum = 0;
        for (int i = 1; i <= n ; i++) {
            long res = 1;
            for (int j = 1; j <= i; j++) {
                res = res * j;
            }
            sum += res;
        }
        System.out.println(sum);
    }
}
