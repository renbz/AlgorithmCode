package questionAll;

import java.util.PriorityQueue;

/**
 * @author Ren
 */

public class R0703_数据流中的第K大元素 {

    PriorityQueue<Integer> minHeap;
    int k;

    public R0703_数据流中的第K大元素(int k, int[] nums) {
        this.k = k;

        minHeap = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if(minHeap.size()<k){
            minHeap.offer(val);
        }else if(minHeap.peek()<val){
            minHeap.poll();
            minHeap.add(val);
        }

        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */