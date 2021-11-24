package 学习计划.剑指Offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren
 */

public class R56_2_数组中数字出现的次数II {

    public int singleNumber(int[] nums) {
        long sum1 = 0, sum2 = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            sum1+=num;
            if(set.add(num)) sum2+=num;
        }
        return (int)((3*sum2-sum1)/2);
    }

}
