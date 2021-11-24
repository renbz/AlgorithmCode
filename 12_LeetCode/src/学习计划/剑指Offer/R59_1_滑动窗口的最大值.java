package 学习计划.剑指Offer;

import java.util.PriorityQueue;

/**
 * @author Ren
 */

public class R59_1_滑动窗口的最大值 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0 || nums==null) return new int[]{};
        int[] ans = new int[nums.length - k + 1];
        PriorityQueue priorityQueue = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);
        for (int i = 0; i < k; i++) {
            priorityQueue.add(nums[i]);
        }
        ans[0] = (int) priorityQueue.peek();
        for (int i = 0; i < nums.length-k; i++) {
            priorityQueue.remove(nums[i]);
            priorityQueue.add(nums[i+k]);
            ans[i+1] = (int) priorityQueue.peek();
        }
        return ans;
    }

}
