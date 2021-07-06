package questionAll;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren
 */

public class R0001_两数之和 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                return new int[]{map.get(target - nums[i]), i};

            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{1,1};


    }

}
