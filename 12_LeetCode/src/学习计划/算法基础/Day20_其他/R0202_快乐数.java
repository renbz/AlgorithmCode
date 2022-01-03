package 学习计划.算法基础.Day20_其他;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/3 10:24
 * @Description:
 */

public class R0202_快乐数 {

    public boolean isHappy(int n) {
        int slow = n, fast = getNext(n);
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }

    int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum += d * d;
        }
        return sum;
    }

}
