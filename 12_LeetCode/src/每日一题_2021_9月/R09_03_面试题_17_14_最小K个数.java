package 每日一题_2021_9月;

import java.util.PriorityQueue;

/**
 * @author Ren
 */

public class R09_03_面试题_17_14_最小K个数 {
    public int[] smallestK(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = minHeap.poll();
        }
        return ans;
    }
}
