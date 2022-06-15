package 每日一题_2022_06月;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/13 21:15
 * @Description:
 */

public class R06_13_1051_高度检查器 {

    public int heightChecker(int[] heights) {
        int n = heights.length, ans = 0;
        int[] expected = new int[n];
        System.arraycopy(heights, 0, expected, 0, n);
        Arrays.sort(expected);
        for (int i = 0; i < n; i++) {
            if (heights[i] != expected[i]) ans++;
        }
        return ans;
    }


}
