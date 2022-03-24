package 学习计划.算法.算法入门.Day14_位运算;

/**
 * @author Ren
 */

public class R01_0190_颠倒二进制位 {

    public static void main(String[] args) {
        R01_0190_颠倒二进制位 obj = new R01_0190_颠倒二进制位();
        int res = obj.reverseBits(43261596);
        System.out.println(Integer.parseInt("00111001011110000010100101000000", 2));
        System.out.println(res);
    }

    public int reverseBits(long n) {
        String s = Long.toBinaryString(n);
        s = zero(32 - s.length()) + s;
        int res = Integer.parseInt(new StringBuilder(s).reverse().toString(), 2);
        return res;
    }

    public String zero(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) builder.append(0);
        return builder.toString();
    }
}