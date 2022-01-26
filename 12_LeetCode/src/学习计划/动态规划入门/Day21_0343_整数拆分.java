package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 21:30
 * @Description:
 */

public class Day21_0343_整数拆分 {

    public int integerBreak(int n) {
        if (n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        if (b == 0) return (int) Math.pow(3, a);
        if (b == 1) return (int) Math.pow(3, a - 1) * 4;
        else return (int) Math.pow(3, a) * 2;
    }

}
