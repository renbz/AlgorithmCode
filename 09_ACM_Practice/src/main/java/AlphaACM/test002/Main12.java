package AlphaACM.test002;

/**
 * @author Ren
 */

import java.util.*;

public class Main12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = (sum + m) % i;
        }
        System.out.println((sum + k) % n);
    }
}
