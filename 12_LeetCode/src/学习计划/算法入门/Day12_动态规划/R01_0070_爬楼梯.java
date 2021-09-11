package 学习计划.算法入门.Day12_动态规划;

/**
 * @author Ren
 */

public class R01_0070_爬楼梯 {

    public int climbStairs(int n) {
        if(n<=2) return n;

        int a=1,b=2,c=2;
        for (int i = 3; i <=n ; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

}
