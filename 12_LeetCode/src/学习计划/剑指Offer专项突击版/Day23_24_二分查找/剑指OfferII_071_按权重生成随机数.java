package 学习计划.剑指Offer专项突击版.Day23_24_二分查找;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/13 15:33
 * @Description:
 */

public class 剑指OfferII_071_按权重生成随机数 {

    class Solution {
        int[] pre;
        int total;

        public Solution(int[] w) {
            pre = new int[w.length];
            pre[0] = w[0];
            for (int i = 1; i < w.length; ++i) {
                pre[i] = pre[i - 1] + w[i];
            }
            total = Arrays.stream(w).sum();
        }

        public int pickIndex() {
            int x = (int) (Math.random() * total) + 1;
            return binarySearch(x);
        }

        private int binarySearch(int x) {
            int low = 0, high = pre.length - 1;
            while (low < high) {
                int mid = (high - low) / 2 + low;
                if (pre[mid] < x) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }


}
