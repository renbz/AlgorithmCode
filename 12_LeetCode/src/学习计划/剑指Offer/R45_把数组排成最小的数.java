package 学习计划.剑指Offer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Ren
 */

public class R45_把数组排成最小的数 {



    public String minNumber(int[] nums) {

        String str[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++) str[i] = String.valueOf(nums[i]);
        Arrays.sort(str, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder ans = new StringBuilder();
        for (String s : str) ans.append(s);
        return ans.toString();
    }
}
