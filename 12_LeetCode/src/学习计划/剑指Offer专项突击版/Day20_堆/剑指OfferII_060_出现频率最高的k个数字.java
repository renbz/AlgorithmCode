package 学习计划.剑指Offer专项突击版.Day20_堆;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/10 11:42
 * @Description:
 */

public class 剑指OfferII_060_出现频率最高的k个数字 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(new int[]{entry.getKey(), entry.getValue()});
            if (maxHeap.size() > k) maxHeap.poll();
        }
        int[] ans = new int[k];
        while (!maxHeap.isEmpty()) {
            ans[--k] = maxHeap.poll()[0];
        }
        return ans;
    }

}
