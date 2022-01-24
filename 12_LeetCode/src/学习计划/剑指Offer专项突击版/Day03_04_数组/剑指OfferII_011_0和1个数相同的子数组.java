package 学习计划.剑指Offer专项突击版.Day03_04_数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/23 18:08
 * @Description:
 */

public class 剑指OfferII_011_0和1个数相同的子数组 {

    public int findMaxLength(int[] nums) {
        //遇0则-1,遇1则+1,前缀和+哈希表优化
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0, cur = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) cur++;
            else cur--;
            if (map.containsKey(cur)) ans = Math.max(ans, i - map.get(cur));
            else map.put(cur, i);
        }
        return ans;
    }

}
