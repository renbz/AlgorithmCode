package 学习计划.编程能力.编程能力入门.Day04_循环;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/26 23:27
 * @Description:
 */

public class R0202_快乐数 {

    public boolean isHappy(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

    public int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

}
