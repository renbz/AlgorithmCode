package 学习计划.算法.算法基础.Day10_递归_回溯;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/24 19:21
 * @Description:
 */

public class R0047_全排列II {

    int len;
    int[] nums;
    List<List<Integer>> ans = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        len = nums.length;
        this.nums = nums;
        f(0);
        return ans;
    }

    private void f(int k) {
        if (k == len) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) list.add(num);
            if (set.add(list)) ans.add(list);
        }
        for (int i = k; i < len; i++) {
            int t = nums[k];
            nums[k] = nums[i];
            nums[i] = t;
            f(k + 1);
            t = nums[k];
            nums[k] = nums[i];
            nums[i] = t;
        }
    }
}
