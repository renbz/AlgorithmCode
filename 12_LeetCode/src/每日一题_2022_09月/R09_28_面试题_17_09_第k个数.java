package 每日一题_2022_09月;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/9/28 20:41
 * @Description:
 */

public class R09_28_面试题_17_09_第k个数 {

    public int getKthMagicNumber(int k) {
        int[] factors = {3, 5, 7};
        Set<Long> seen = new HashSet<Long>();
        PriorityQueue<Long> heap = new PriorityQueue<Long>();
        seen.add(1L);
        heap.offer(1L);
        int magic = 0;
        for (int i = 0; i < k; i++) {
            long curr = heap.poll();
            magic = (int) curr;
            for (int factor : factors) {
                long next = curr * factor;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return magic;
    }

}
