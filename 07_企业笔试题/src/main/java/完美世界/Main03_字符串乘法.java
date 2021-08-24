package 完美世界;

import java.math.BigInteger;

/**
 * @author Ren
 */

public class Main03_字符串乘法 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 传入num1数字字符串与num2数字字符串，返回两个字符串数字的乘积。
     * @param num1 string字符串 数字字符串1
     * @param num2 string字符串 数字字符串2
     * @return string字符串
     */
    public String multiply (String num1, String num2) {
        // write code here
        BigInteger bg1 = new BigInteger(num1);
        BigInteger bg2 = new BigInteger(num2);
        return (bg1.multiply(bg2)).toString();
    }

}
