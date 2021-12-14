package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/13 12:59
 * @Description:
 */

public class Day01_1137_第N个泰波那契数 {

    public int tribonacci(int n) {
        int n0 = 0, n1 = 1, n2 = 1, ans = 0;
        if (n == 0) return 0;
        else if (n <= 2) return 1;
        while (n-- > 2) {
            ans = n0 + n1 + n2;
            n0 = n1;
            n1 = n2;
            n2 = ans;
        }
        return ans;
    }

}
