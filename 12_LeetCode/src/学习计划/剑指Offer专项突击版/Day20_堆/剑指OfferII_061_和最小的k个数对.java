package 学习计划.剑指Offer专项突击版.Day20_堆;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/10 11:54
 * @Description:
 */

public class 剑指OfferII_061_和最小的k个数对 {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        // 创建一个大根堆，堆中元素排序按照数对和进行逆序排序。
        PriorityQueue<List<Integer>> heap = new PriorityQueue<>(
                (pair1, pair2) -> pair2.get(0) + pair2.get(1) - pair1.get(0) - pair1.get(1)
        );
        // 数组1取前k个数 （长度n小于k则取n个，数组2也相同）,组成 k*k 个数对
        int len1 = Math.min(nums1.length, k);
        int len2 = Math.min(nums2.length, k);
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                // 将数对加入大根堆中
                ArrayList<Integer> list = new ArrayList<>();
                list.add(nums1[i]);
                list.add(nums2[j]);
                heap.add(list);
                // 如果大根堆中的元素总量超过 k , 则将大根堆的堆顶元素删除。
                if (heap.size() > k) heap.poll();
            }
        }
        // 最后剩下的大根堆中的数对就是和最小的k个数对，将其保存到列表中。
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (List<Integer> list : heap) {
            ans.add(list);
        }
        return ans;
    }

}
