package 学习计划.R01_20天算法刷题计划.数据结构基础.Day01_数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ren
 */

public class R0015_三数之和 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 3) return ans;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return ans;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    ans.add(list);

                    while (l < r && nums[l] == nums[l + 1]) l = l + 1;
                    while (l < r && nums[r] == nums[r - 1]) r = r - 1;
                    l = l + 1;
                    r = r - 1;
                } else if (nums[i] + nums[l] + nums[r] > 0){
                    r = r - 1;
                } else {
                    l = l + 1;
                }
            }
        }
        return ans;
    }
}
