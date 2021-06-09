package ch04;

import java.math.BigInteger;

/**
 * @author Ren
 */

public class R05_BigInteger {

    public static void main(String[] args) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= 100; i++)
            res = res.multiply(BigInteger.valueOf(i));
        System.out.println(res);
    }

}
