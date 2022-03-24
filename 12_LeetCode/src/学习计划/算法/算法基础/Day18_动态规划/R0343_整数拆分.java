package 学习计划.算法.算法基础.Day18_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/2 12:27
 * @Description:
 */

public class R0343_整数拆分 {

    public int integerBreak(int n) {
        if (n <= 3) return n - 1;

        int a = n / 3, b = n % 3;
        if (b == 0) return (int) Math.pow(3, a);
        if (b == 1) return (int) Math.pow(3, a - 1) * 4;
        else return (int) Math.pow(3, a) * 2;
    }

}
