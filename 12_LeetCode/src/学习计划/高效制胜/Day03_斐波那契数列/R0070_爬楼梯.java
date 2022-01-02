package 学习计划.高效制胜.Day03_斐波那契数列;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 21:41
 * @Description:
 */

public class R0070_爬楼梯 {

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
