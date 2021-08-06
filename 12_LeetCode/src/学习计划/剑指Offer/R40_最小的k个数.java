package 学习计划.剑指Offer;

import java.util.PriorityQueue;

/**
 * @author Ren
 */

public class R40_最小的k个数 {


    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }
        int[] resArr = new int[k];
        for (int i = 0; i < k; i++) {
            resArr[i] = minHeap.poll();
        }
        return resArr;
    }

}
