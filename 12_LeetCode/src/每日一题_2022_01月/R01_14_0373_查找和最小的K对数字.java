package 每日一题_2022_01月;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/14 09:08
 * @Description:
 */

public class R01_14_0373_查找和最小的K对数字 {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int index = 0, m = nums1.length, n = nums2.length;
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(k,
                (o1, o2) -> nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]]);

        for (int i = 0; i < Math.min(m, k); i++) {
            pq.offer(new int[]{i,0});
        }
        while (k-->0 && !pq.isEmpty()){
            int[] idxPair = pq.poll();
            List<Integer> list = new ArrayList<>();
            list.add(nums1[idxPair[0]]);
            list.add(nums2[idxPair[1]]);
            ans.add(list);
            if(idxPair[1]+1<n){
                pq.offer(new int[]{idxPair[0],idxPair[1]+1});
            }
        }
        return ans;
    }

}
