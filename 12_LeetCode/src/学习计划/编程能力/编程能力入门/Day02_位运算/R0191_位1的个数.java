package 学习计划.编程能力.编程能力入门.Day02_位运算;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/24 09:55
 * @Description:
 */

public class R0191_位1的个数 {

    public int hammingWeight(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ans++;
            }
        }
        return ans;
    }

}
