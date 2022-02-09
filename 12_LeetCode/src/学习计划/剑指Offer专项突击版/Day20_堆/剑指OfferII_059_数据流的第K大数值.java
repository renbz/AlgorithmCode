package 学习计划.剑指Offer专项突击版.Day20_堆;

import java.util.PriorityQueue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/9 09:49
 * @Description:
 */

public class 剑指OfferII_059_数据流的第K大数值 {

    class KthLargest {

        PriorityQueue<Integer> maxheap;
        int k;

        public KthLargest(int k, int[] nums) {
            maxheap = new PriorityQueue<>(k);
            this.k = k;
            for (int num : nums) {
                if (maxheap.size() == k) maxheap.poll();
                maxheap.add(num);
            }
        }

        public int add(int val) {
            maxheap.offer(val);
            if (maxheap.size() > k) maxheap.poll();
            return maxheap.peek();
        }
    }


}
