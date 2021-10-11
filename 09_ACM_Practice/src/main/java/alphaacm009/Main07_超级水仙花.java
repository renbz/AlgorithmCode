package alphaacm009;

/**
 * @author Ren
 */

public class Main07_超级水仙花 {

    public static void main(String[] args) {
        for (int i = 10000; i <= 99999; i++) {
            int a1 = i / 10000, a2 = i % 10000;
            int b1 = i / 1000, b2 = i % 1000;
            int c1 = i / 100, c2 = i % 100;
            int d1 = i / 10, d2 = i % 10;

            if (a1 * a2 + b1 * b2 + c1 * c2 + d1 * d2 == i) {
                System.out.printf(i+" ");
            }
        }
    }
}
