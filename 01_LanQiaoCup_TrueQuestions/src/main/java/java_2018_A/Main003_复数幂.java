package java_2018_A;

import java.math.BigInteger;

/**
 * @author Ren
 */

public class Main003_复数幂 {
    public static void main(String[] args) {
        /**
         * (m+ni)*(m+ni)*(m+ni)*...*(m+ni) = (m*m+2*m*ni-n*n)*...*(m+ni)
         */
        BigInteger a = BigInteger.valueOf(2);
        BigInteger b = BigInteger.valueOf(3);
        BigInteger c = BigInteger.valueOf(2);
        BigInteger d = BigInteger.valueOf(3);
        BigInteger e = BigInteger.ZERO;
        for (int i = 2; i <= 123456; i++) {
            e = c; //保留c的值，因为c一直在变
            c = c.multiply(a).subtract(b.multiply(d)); // c = a*c-b*d  新的实数部分
            d = a.multiply(d).add(b.multiply(e));      // d = a*d+b*c  新的虚数部分
        }
        if(d.compareTo(BigInteger.ZERO)==1)
            System.out.println(c + "+" + d + "i");
        if(d.compareTo(BigInteger.ZERO)==-1)
            System.out.println(""+c+d+"i");
    }
}
