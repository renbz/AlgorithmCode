package 每日一题_2022_06月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/7 23:36
 * @Description:
 */

public class R06_07_0875_爱吃香蕉的珂珂 {

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, hight = 0;
        for (int pile : piles) {
            hight = Math.max(hight, pile);
        }
        int k = hight;
        while (low < hight) {
            int speed = (hight - low) / 2 + low;
            long time = getTime(piles, speed);
            if (time <= h) {
                k = speed;
                hight = speed;
            } else {
                low = speed + 1;
            }
        }
        return k;
    }

    public long getTime(int[] piles, int speed) {
        long time = 0;
        for (int pile : piles) {
            int curTime = (pile + speed - 1) / speed;
            time += curTime;
        }
        return time;
    }

}
