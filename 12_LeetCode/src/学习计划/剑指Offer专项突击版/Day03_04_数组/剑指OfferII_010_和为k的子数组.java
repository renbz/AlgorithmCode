package 学习计划.剑指Offer专项突击版.Day03_04_数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/23 17:43
 * @Description:
 */

public class 剑指OfferII_010_和为k的子数组 {

    public int subarraySum(int[] nums, int k) {
        //前缀和+HashMap优化
        int ans = 0, sum = 0, len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) ans += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

}
