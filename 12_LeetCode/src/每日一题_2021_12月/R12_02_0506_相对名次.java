package 每日一题_2021_12月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/2 20:27
 * @Description:
 */

public class R12_02_0506_相对名次 {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        int len = score.length;
        int[][] arr = new int[len][2];
        for (int i = 0; i < len; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        String[] res = new String[len];
        for (int i = 0; i < len; i++) {
            if (i >= 3) {
                res[arr[i][1]] = String.valueOf(i + 1);
            } else {
                res[arr[i][1]] = ans[i];
            }
        }
        return res;
    }
}
