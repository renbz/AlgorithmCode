package 学习计划.高效制胜.Day03_斐波那契数列;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 21:40
 * @Description:
 */

public class R0509_斐波那契数 {

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
