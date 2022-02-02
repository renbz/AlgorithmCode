package 学习计划.剑指Offer专项突击版.Day14_15_队列;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/2 15:04
 * @Description:
 */

public class 剑指OfferII_041_滑动窗口的平均值 {

    class MovingAverage {

        /**
         * Initialize your data structure here.
         */
        Queue<Integer> queue;
        int size;
        double sum = 0;

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
