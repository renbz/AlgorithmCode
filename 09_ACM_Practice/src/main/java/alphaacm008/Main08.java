package alphaacm008;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long n = in.nextLong();
            if (n == 0) return;
            // Math.sqrt(n)  是求n的平方根，当平方根 为整数时，它的因子以平方根数对称分布为奇数个，
            // 即:  第n层被按了奇数次，可以到达第n层
            long t = (long) Math.sqrt(n);
            if (t * t == n) System.out.println("Goddess,I'm coming~~~");
            else System.out.println("Farewell~");
        }
    }
}