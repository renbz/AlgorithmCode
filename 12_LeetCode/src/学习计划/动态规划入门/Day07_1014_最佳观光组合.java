package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/12 19:56
 * @Description:
 */

public class Day07_1014_最佳观光组合 {

    public int maxScoreSightseeingPair(int[] values) {
        int max = values[0] + 0, ans = 0;
        for (int j = 1; j < values.length; j++) {
            ans = Math.max(ans, max + values[j] - j);
            // 边遍历边维护
            max = Math.max(max, values[j] + j);  //max相当于公式中 values[i]+i
        }
        return ans;
    }

}
