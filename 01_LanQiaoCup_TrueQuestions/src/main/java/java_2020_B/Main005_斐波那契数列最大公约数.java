package java_2020_B;

import java.math.BigInteger;

/**
 * @author Ren
 */

public class Main005_斐波那契数列最大公约数 {

    // 计算第t个斐波那契数
    public static BigInteger f(int t) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ZERO;
        for (int i = 3; i <= t; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return c;
    }

    // 计算两数的最大公约数(欧几里得算法)
    public static BigInteger gcd(BigInteger a, BigInteger b){
        if(b.compareTo(BigInteger.ZERO)==0){
            return a;
        }else{
            return gcd(b,a.mod(b));
        }
    }
    public static void main(String[] args) {
        System.out.println(f(2020));
        System.out.println(f(520));
        BigInteger n = gcd(f(2020),f(520));
        System.out.println(n);
    }
}
