package java_2013_B;

import java.math.BigDecimal;

/**
 * @author Ren
 */

public class Main004_黄金连分数 {
    public static void main(String[] args) {
        BigDecimal ans1 = fb(200).divide(fb(201),110,BigDecimal.ROUND_HALF_DOWN);
        BigDecimal ans2 = fb(300).divide(fb(301),110,BigDecimal.ROUND_HALF_DOWN);
        BigDecimal ans3 = fb(400).divide(fb(401),110,BigDecimal.ROUND_HALF_DOWN);
        BigDecimal ans4 = fb(800).divide(fb(801),110,BigDecimal.ROUND_HALF_DOWN);
        System.out.println(ans1.toPlainString().substring(0,103));
        System.out.println(ans2.toPlainString().substring(0,103));
        System.out.println(ans3.toPlainString().substring(0,103));
        System.out.println(ans4.toPlainString().substring(0,103));

    }
    //求斐波那契
    static BigDecimal fb(int n){
        BigDecimal a = BigDecimal.ONE;
        BigDecimal b = BigDecimal.ONE;
        for (int i = 0; i < n; i++) {
            BigDecimal t = b;
            b = a.add(b);
            a=t;
        }
        return b;
    }

}
