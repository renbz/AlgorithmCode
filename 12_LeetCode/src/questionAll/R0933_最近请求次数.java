package questionAll;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/5 00:29
 * @Description:
 */

public class R0933_最近请求次数 {

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
