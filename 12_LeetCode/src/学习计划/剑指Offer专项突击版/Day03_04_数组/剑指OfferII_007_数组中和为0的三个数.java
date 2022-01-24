package 学习计划.剑指Offer专项突击版.Day03_04_数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/22 13:30
 * @Description:
 */

public class 剑指OfferII_007_数组中和为0的三个数 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if (len < 3) return ans;
        Arrays.sort(nums);

        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) return ans;
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去除重复元素
            int l = i + 1, r = len - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    ans.add(list);

                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return ans;
    }

}
