package java_2020_B;

/**
 * @author Ren
 */

import java.math.BigInteger;
public class Main007_八次求和_4 {

    static long MOD = 123456789;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 1000000; i++) {
            get1(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("测试100万条数据共用时：" + (endTime - startTime) + "ms");
    }
    static BigInteger get1(int m) {
        //以下为公式：
        //(1^8+2^8+3^8+...+n^8) = (10n^9+45n^8+60n^7-42n^5+20n^3-3n)/90
        BigInteger n = BigInteger.valueOf(m);
        BigInteger result = BigInteger.ZERO;
        result = result.add(BigInteger.valueOf(10L).multiply(n.pow(9)));
        result = result.add(BigInteger.valueOf(45L).multiply(n.pow(8)));
        result = result.add(BigInteger.valueOf(60L).multiply(n.pow(7)));
        result = result.subtract(BigInteger.valueOf(42L).multiply(n.pow(5)));
        result = result.add(BigInteger.valueOf(20L).multiply(n.pow(3)));
        result = result.subtract(BigInteger.valueOf(3L).multiply(n));
        result = result.divide(BigInteger.valueOf(90L));
        result = result.mod(BigInteger.valueOf(123456789L));
        return result;
    }

}
