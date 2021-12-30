package 学习计划.贝壳找房.Day04;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/29 22:02
 * @Description:
 */

public class R03_0264_丑数II {

    public int nthUglyNumber(int n) {
        int[] factors = {2, 3, 5};
        Set<Long> set = new HashSet<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();
        set.add(1L);
        heap.add(1L);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long curr = heap.poll();
            ugly = (int)curr;
            for (int factor : factors) {
                long next = curr * factor;
                if (set.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return ugly;
    }

}
