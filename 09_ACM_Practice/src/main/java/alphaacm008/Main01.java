package alphaacm008;

/**
 * @author Ren
 */

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) sum += i + (n / i);   // 优化1 首尾因数  同时相加
            if (sum > n) break;   // 优化2  当达到此条件后 无需冗余计算了
        }

        if (sum == n) System.out.println("Pure");
        else if (sum > n) System.out.println("Late");
        else System.out.println("Early");
    }
}
