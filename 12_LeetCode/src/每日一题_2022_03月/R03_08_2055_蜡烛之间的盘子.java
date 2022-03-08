package 每日一题_2022_03月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/8 09:20
 * @Description:
 */

public class R03_08_2055_蜡烛之间的盘子 {

    public static int[] platesBetweenCandles(String s, int[][] queries) {
        int len = s.length();
        //前缀和,right[]记录一个范围内右边的蜡烛位置
        int[] preSum = new int[len];
        int[] right = new int[len];
        preSum[0] = s.charAt(0) == '*' ? 1 : 0;
        right[0] = s.charAt(0) == '|' ? 0 : -1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                preSum[i] = preSum[i - 1] + 1;
                right[i] = right[i - 1];
            } else {
                preSum[i] = preSum[i - 1];
                right[i] = i;
            }
        }
        // 记录一个范围内左边的蜡烛位置
        int[] left = new int[len];
        left[len - 1] = s.charAt(len - 1) == '|' ? len - 1 : -1;
        for (int i = s.length() - 2; i >= 0; i--) {
            if (s.charAt(i) == '|') left[i] = i;
            else left[i] = left[i + 1];
        }
        int[] ans = new int[queries.length];
        int i = 0;
        for (int[] query : queries) {
            int l = left[query[0]], r = right[query[1]];
            if (l == -1 || r == -1 || l > query[1] || r < query[0]) {
                ans[i++] = 0;
            } else {
                ans[i++] = preSum[r] - preSum[l];
            }
        }
        return ans;
    }
}
