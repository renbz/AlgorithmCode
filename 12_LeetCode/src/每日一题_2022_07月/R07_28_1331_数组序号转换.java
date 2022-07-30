package 每日一题_2022_07月;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/28 19:36
 * @Description:
 */

public class R07_28_1331_数组序号转换 {

    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = new int[arr.length];
        System.arraycopy(arr, 0, sortedArr, 0, arr.length);
        Arrays.sort(sortedArr);
        Map<Integer, Integer> ranks = new HashMap<Integer, Integer>();
        int[] ans = new int[arr.length];
        for (int a : sortedArr) {
            if (!ranks.containsKey(a)) {
                ranks.put(a, ranks.size() + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = ranks.get(arr[i]);
        }
        return ans;
    }


}
