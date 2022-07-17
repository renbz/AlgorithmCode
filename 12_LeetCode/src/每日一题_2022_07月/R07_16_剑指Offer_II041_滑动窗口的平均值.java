package 每日一题_2022_07月;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/16 22:10
 * @Description:
 */

public class R07_16_剑指Offer_II041_滑动窗口的平均值 {

    class MovingAverage {

        Queue<Integer> queue;
        int size;
        double sum = 0;

        /**
         * Initialize your data structure here.
         */
        public MovingAverage(int size) {
            queue = new LinkedList<>();
            this.size = size;
        }

        public double next(int val) {
            if (queue.size() >= size) sum -= queue.poll();
            queue.add(val);
            sum += val;
            return sum / queue.size();
        }
    }

}
