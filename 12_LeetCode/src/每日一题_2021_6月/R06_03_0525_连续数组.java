package 每日一题_2021_6月;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren
 */

public class R06_03_0525_连续数组 {
    public int findMaxLength(int[] nums) {
        int max = -1;
        int preSum = 0;
        Map<Integer,Integer> map = new HashMap();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if (nums[i] == 0) preSum--;
            else preSum++;
            if(map.get(preSum)==null){
                map.put(preSum,i);
            }else{
                max = max>i-map.get(preSum)?max:i-map.get(preSum);
            }
        }
        return max;
    }

}
