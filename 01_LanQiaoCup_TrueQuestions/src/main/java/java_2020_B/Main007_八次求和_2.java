package java_2020_B;

/**
 * @author Ren
 */

import java.math.BigInteger;
public class Main007_八次求和_2 {

    static long MOD = 123456789;

    public static void main(String[] args) {
        boolean flag = true;
        for (int i = 1000000; i < 1000050; i++) {
            if (!get1(i).equals(get2(i))) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "公式正确" : "公式有误");


        long startTime = System.currentTimeMillis();
        for (int i = 1000000; i < 1000050; i++) {
            get1(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("公式求解 " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 1000000; i < 1000050; i++) {
            get2(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("耿直直接求解 " + (endTime - startTime) + "ms");
    }

    static BigInteger get1(int n_) {
        //(1^8+2^8+3^8+...+n^8) = (10n^9+45n^8+60n^7-42n^5+20n^3-3n)/90
        BigInteger n = new BigInteger(n_ + "");
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

    static BigInteger get2(int n) {
        BigInteger result = BigInteger.ZERO;

        for (int i = 0; i < n; i++) {
            BigInteger temp = new BigInteger((i + 1) + "").pow(8);
            result = result.add(temp);
        }
        return result.mod(new BigInteger("123456789"));
    }

}
