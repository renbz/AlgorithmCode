package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/13 12:55
 * @Description:
 */

public class Day01_0509_斐波那契数列 {

    public int fib(int n) {
        int n0 = 0, n1 = 1, ans = 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        while (n-- > 1) {
            ans = n0 + n1;
            n0 = n1;
            n1 = ans;
        }
        return ans;
    }


}
