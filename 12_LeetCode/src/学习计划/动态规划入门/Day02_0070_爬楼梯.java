package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/13 14:12
 * @Description:
 */

public class Day02_0070_爬楼梯 {

    public int climbStairs(int n) {
        if (n <= 2) return n;

        int a = 1, b = 2, c = 2;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

}
