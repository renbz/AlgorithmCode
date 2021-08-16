package 学习计划.数据结构基础.Day08_字符串;

import java.math.BigInteger;

/**
 * @author Ren
 */

public class R0043_字符串相乘 {

    /*public String multiply(String num1, String num2) {
        long res = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                res += (num1.charAt(i) - '0') * (Math.pow(10, num1.length() - 1 - i)) * (num2.charAt(j) - '0') * (Math.pow(10, num2.length() - 1 - j));
            }
        }
        return String.valueOf(res);
    }*/

    public String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger n3 = n1.multiply(n2);

        return String.valueOf(n3);
    }

}
