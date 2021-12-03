package 学习计划.剑指Offer;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/3 10:20
 * @Description:
 */

public class R59_2_队列的最大值 {

    class MaxQueue {
        Deque<Integer> d;
        Queue<Integer> q;

        public MaxQueue() {
            d = new LinkedList<>();
            q = new LinkedList<>();
        }

        public int max_value() {
            if (d.isEmpty()) {
                return -1;
            }
            return d.peekFirst();
        }

        public void push_back(int value) {
            while (!d.isEmpty() && d.peekLast() < value) {
                d.pollLast();
            }
            d.offerLast(value);
            q.offer(value);
        }

        public int pop_front() {
            if (q.isEmpty()) {
                return -1;
            }
            int ans = q.poll();
            if (ans == d.peekFirst()) {
                d.pollFirst();
            }
            return ans;
        }
    }
}
