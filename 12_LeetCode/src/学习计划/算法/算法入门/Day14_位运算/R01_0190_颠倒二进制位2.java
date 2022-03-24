package 学习计划.算法.算法入门.Day14_位运算;

/**
 * @author Ren
 */

public class R01_0190_颠倒二进制位2 {

    public static void main(String[] args) {
        R01_0190_颠倒二进制位2 obj = new R01_0190_颠倒二进制位2();
        int res = obj.reverseBits(43261596);
        System.out.println(Integer.parseInt("00111001011110000010100101000000", 2));
        System.out.println(res);
    }

    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
}