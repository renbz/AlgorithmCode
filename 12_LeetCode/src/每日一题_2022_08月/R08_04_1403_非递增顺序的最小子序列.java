package 每日一题_2022_08月;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/22 22:28
 * @Description:
 */

public class R08_04_1403_非递增顺序的最小子序列 {

    public List<Integer> minSubsequence(int[] nums) {
        int total = Arrays.stream(nums).sum();
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        int curr = 0;
        for (int i = nums.length - 1; i >= 0; --i) {
            curr += nums[i];
            ans.add(nums[i]);
            if (total - curr < curr) {
                break;
            }
        }
        return ans;
    }

}
