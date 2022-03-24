package 学习计划.数据结构.数据结构基础.Day20_优先队列;

import java.util.PriorityQueue;

/**
 * @author Ren
 */

public class R0215_数组中的第K个最大元素 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        for (int i = 0; i < nums.length; i++) {
            if(minHeap.size()<k){
                minHeap.add(nums[i]);
            }else{
                minHeap.add(nums[i]);
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }
}
