package 每日一题_2022_05月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/8 01:21
 * @Description:
 */

public class R05_08_0442_数组中重复的数据 {

    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);
            if(nums[x-1]>0){
                nums[x-1] = -nums[x-1];
            }else{
                ans.add(x);
            }
        }
        return ans;
    }

}
