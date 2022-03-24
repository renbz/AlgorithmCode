package 学习计划.算法.算法基础.Day09_递归_回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/12 15:14
 * @Description:
 */

public class R0078_子集_2 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = (1 << n); i < (1 << n + 1); i++) {
            String bitmask = Integer.toBinaryString(i).substring(1);
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                //if ((j & (1 << i)) != 0) cur.add(nums[j]);
                if (bitmask.charAt(j) == '1') cur.add(nums[j]);
            }
            ans.add(cur);
        }
        return ans;
    }

}
