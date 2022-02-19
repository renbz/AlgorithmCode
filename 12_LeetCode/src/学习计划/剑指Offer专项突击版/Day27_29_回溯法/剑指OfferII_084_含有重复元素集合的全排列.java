package 学习计划.剑指Offer专项突击版.Day27_29_回溯法;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/17 23:06
 * @Description:
 */

public class 剑指OfferII_084_含有重复元素集合的全排列 {

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
