package 学习计划.R01_20天算法刷题计划.数据结构基础.Day05_数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren
 */

public class R0560_和为K的子数组 {

    public int subarraySum(int[] nums, int k) {
        int ans = 0, sum = 0;
        //Hash表优化
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) ans += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
