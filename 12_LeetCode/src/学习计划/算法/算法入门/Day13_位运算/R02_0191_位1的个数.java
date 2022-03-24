package 学习计划.算法.算法入门.Day13_位运算;

/**
 * @author Ren
 */

public class R02_0191_位1的个数 {

    public int hammingWeight(int n) {
        int count = 0;
        String str = Integer.toBinaryString(n);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') count++;
        }
        return count;
    }

}
