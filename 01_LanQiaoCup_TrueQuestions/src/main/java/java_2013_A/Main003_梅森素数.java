package java_2013_A;

import java.math.BigInteger;

/**
 * @author Ren
 */

public class Main003_梅森素数 {
    public static void main(String[] args) {
        //计算 2^11213 - 1
        BigInteger a = BigInteger.valueOf(2);
        BigInteger res = BigInteger.ONE;

        for (int i = 0; i < 11213; i++) {
            res = res.multiply(a);
        }
        String s1 = res.toString();
        String s = s1.substring(s1.length()-100,s1.length());
        System.out.println(s);
    }

}
