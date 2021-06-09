package 每日一题_2021_6月;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren
 */

public class R06_02_0523_连续的子数组和 {

    public boolean checkSubarraySum(int[] nums, int k) {
        /**
         * arr为模k后的前缀和
         */
        int [] arr = new int[nums.length+1];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            arr[i+1] = (arr[i]+nums[i]%k)%k;
        }
        for (int i = 0; i < arr.length; i++) {
            if( map.containsKey(arr[i]) && i-map.get(arr[i])>=2){
                return true;
            }else{
                if(!map.containsKey(arr[i])){
                    map.put(arr[i],i);
                }
            }
        }
        return false;
    }
}
