package questionAll;

import java.util.PriorityQueue;

/**
 * @author Ren
 */

public class R0215_数组中的第K个最大元素 {

    public int findKthLargest(int[] nums, int k) {

        //构建小根堆
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (minHeap.size() < k)
                minHeap.add(nums[i]);
            else {
                if (nums[i] > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.add(nums[i]);
                }
            }
        }
        return minHeap.poll();
    }

}
