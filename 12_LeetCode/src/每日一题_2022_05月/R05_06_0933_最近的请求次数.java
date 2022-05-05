package 每日一题_2022_05月;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/6 00:49
 * @Description:
 */

public class R05_06_0933_最近的请求次数 {

    class RecentCounter {

        private Queue<Integer> queue;

        public RecentCounter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.add(t);
            while (queue.peek() < t - 3000) {
                queue.poll();
            }
            return queue.size();
        }
    }

}
